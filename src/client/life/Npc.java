package client.life;

import client.character.Char;
import client.field.Field;
import connection.OutPacket;
import packet.NpcPool;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2/19/2018.
 */
public class Npc extends Life {
    private boolean enabled = true;
    private int presentItemID;
    private byte presentItemState;
    private int presentItemTime;
    private int noticeBoardType;
    private int noticeBoardValue;
    private int alpha; // if hideToLocalUser is true
    private String localRepeatEffect;
    private ScreenInfo screenInfo;
    private Map<Integer, String> scripts = new HashMap<>();
    private boolean move;


    public Npc(int objectId) {
        super(objectId);
    }

    public void encode(OutPacket outPacket) {
        // CNpc::Init
        outPacket.encodePosition(getPosition());
        outPacket.encodeByte(isMove());
        outPacket.encodeByte(getMoveAction());
        outPacket.encodeShort(getFh());
        outPacket.encodeShort(getRx0()); // rgHorz.low
        outPacket.encodeShort(getRx1()); // rgHorz.high
        outPacket.encodeByte(isEnabled());
        outPacket.encodeInt(0); // ?
        outPacket.encodeInt(getPresentItemID());
        outPacket.encodeByte(getPresentItemState());
        outPacket.encodeInt(getPresentItemTime());
        outPacket.encodeInt(getNoticeBoardType());
        if (getNoticeBoardType() == 1) {
            outPacket.encodeInt(getNoticeBoardValue());
        }
        outPacket.encodeInt(getAlpha());
        outPacket.encodeString(getLocalRepeatEffect());
        ScreenInfo si = getScreenInfo();
        outPacket.encodeByte(si != null);
        if (si != null) {
            si.encode(outPacket);
        }
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getPresentItemID() {
        return presentItemID;
    }

    public void setPresentItemID(int presentItemID) {
        this.presentItemID = presentItemID;
    }

    public byte getPresentItemState() {
        return presentItemState;
    }

    public void setPresentItemState(byte presentItemState) {
        this.presentItemState = presentItemState;
    }

    public int getPresentItemTime() {
        return presentItemTime;
    }

    public void setPresentItemTime(int presentItemTime) {
        this.presentItemTime = presentItemTime;
    }

    public int getNoticeBoardType() {
        return noticeBoardType;
    }

    public void setNoticeBoardType(int noticeBoardType) {
        this.noticeBoardType = noticeBoardType;
    }

    public int getNoticeBoardValue() {
        return noticeBoardValue;
    }

    public void setNoticeBoardValue(int noticeBoardValue) {
        this.noticeBoardValue = noticeBoardValue;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public String getLocalRepeatEffect() {
        return localRepeatEffect;
    }

    public void setLocalRepeatEffect(String localRepeatEffect) {
        this.localRepeatEffect = localRepeatEffect;
    }

    public ScreenInfo getScreenInfo() {
        return screenInfo;
    }

    public void setScreenInfo(ScreenInfo screenInfo) {
        this.screenInfo = screenInfo;
    }

    @Override
    public Npc deepCopy() {
        Npc copy = new Npc(getObjectId());
        copy.setLifeType(getLifeType());
        copy.setTemplateId(getTemplateId());
        copy.setX(getX());
        copy.setY(getY());
        copy.setMobTime(getMobTime());
        copy.setF(getF());
        copy.setHide(isHide());
        copy.setFh(getFh());
        copy.setCy(getCy());
        copy.setRx0(getRx0());
        copy.setRx1(getRx1());
        copy.setLimitedName(getLimitedName());
        copy.setUseDay(isUseDay());
        copy.setUseNight(isUseNight());
        copy.setHold(isHold());
        copy.setNoFoothold(isNoFoothold());
        copy.setDummy(isDummy());
        copy.setSpine(isSpine());
        copy.setMobTimeOnDie(isMobTimeOnDie());
        copy.setRegenStart(getRegenStart());
        copy.setMove(isMove());
        copy.setMobAliveReq(getMobAliveReq());
        copy.getScripts().putAll(getScripts());
        return copy;
    }

    public Map<Integer, String> getScripts() {
        return scripts;
    }

    @Override
    public void broadcastSpawnPacket(Char onlyChar) {
        Field field = getField();
        Char controller = field.getLifeToControllers().get(this);
        for (Char chr : field.getChars()) {
            chr.write(NpcPool.npcEnterField(this));
            chr.write(NpcPool.npcChangeController(this, chr == controller));
        }
    }

    public boolean isMove() {
        return move;
    }

    public void setMove(boolean move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return super.toString() + ", Move: " + isMove();
    }
}
