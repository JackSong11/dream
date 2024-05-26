package com.song.dream.common.enums.message;


public enum MessageTemplate {

    NOT_EXTENDED("未知消息", "未知消息", "未知消息"),
    EVALUATE_TARGET_MSG("{}_evaluate_target_submit", "“{}”已开始，请尽快提交创值数据", "评估周期：{}~{}日，请务必于{}日前提交创值数据，以免影响评估进度");

    // 消息场景
    private final String scene;
    // 消息标题
    private final String title;
    // 消息内容
    private final String content;

    MessageTemplate(String scene, String title, String content) {
        this.scene = scene;
        this.title = title;
        this.content = content;
    }

    public static MessageTemplate getMessageTemplate(String scene) {
        MessageTemplate[] var1 = values();
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            MessageTemplate obj = var1[var3];
            if (obj.getScene().equals(scene)) {
                return obj;
            }
        }

        return NOT_EXTENDED;
    }

    public String getScene() {
        return this.scene;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }
}
