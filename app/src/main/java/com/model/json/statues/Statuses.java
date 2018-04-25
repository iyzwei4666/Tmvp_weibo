/**
  * Copyright 2018 aTool.org 
  */
package com.model.json.statues;
import java.util.List;

/**
 * Auto-generated: 2018-04-25 21:58:19
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool.org/json2javabean.php
 */
public class Statuses {


    private String created_at;
    private long id;
    private String idstr;
    private String mid;

    private boolean can_edit;
    private String text;

    private long textLength;

    private long source_allowclick;

    private long source_type;
    private String source;
    private boolean favorited;
    private boolean truncated;

    private String in_reply_to_status_id;

    private String in_reply_to_user_id;

    private String in_reply_to_screen_name;

    private List<PicUrls> pic_urls;

    private String thumbnail_pic;

    private String bmiddle_pic;

    private String original_pic;
    private Object geo;

    private boolean is_paid;

    private long mblog_vip_type;
    private User user;

    private long reposts_count;

    private long comments_count;

    private long attitudes_count;

    private long pending_approval_count;

    private boolean isLongText;
    private long mlevel;
    private Visible visible;

    private long biz_feature;

    private long hasActionTypeCard;

    private List<String> darwin_tags;

    private List<String> hot_weibo_tags;

    private List<String> text_tag_tips;
    private String rid;

    private long userType;

    private long more_info_type;
    private String cardid;

    private long positive_recom_flag;

    private long content_auth;

    private String gif_ids;

    private long is_show_bulletin;

    private CommentManageInfo comment_manage_info;

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdstr() {
        return idstr;
    }

    public void setIdstr(String idstr) {
        this.idstr = idstr;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public boolean isCan_edit() {
        return can_edit;
    }

    public void setCan_edit(boolean can_edit) {
        this.can_edit = can_edit;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getTextLength() {
        return textLength;
    }

    public void setTextLength(long textLength) {
        this.textLength = textLength;
    }

    public long getSource_allowclick() {
        return source_allowclick;
    }

    public void setSource_allowclick(long source_allowclick) {
        this.source_allowclick = source_allowclick;
    }

    public long getSource_type() {
        return source_type;
    }

    public void setSource_type(long source_type) {
        this.source_type = source_type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public boolean isTruncated() {
        return truncated;
    }

    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    public String getIn_reply_to_status_id() {
        return in_reply_to_status_id;
    }

    public void setIn_reply_to_status_id(String in_reply_to_status_id) {
        this.in_reply_to_status_id = in_reply_to_status_id;
    }

    public String getIn_reply_to_user_id() {
        return in_reply_to_user_id;
    }

    public void setIn_reply_to_user_id(String in_reply_to_user_id) {
        this.in_reply_to_user_id = in_reply_to_user_id;
    }

    public String getIn_reply_to_screen_name() {
        return in_reply_to_screen_name;
    }

    public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
        this.in_reply_to_screen_name = in_reply_to_screen_name;
    }

    public List<PicUrls> getPic_urls() {
        return pic_urls;
    }

    public void setPic_urls(List<PicUrls> pic_urls) {
        this.pic_urls = pic_urls;
    }

    public String getThumbnail_pic() {
        return thumbnail_pic;
    }

    public void setThumbnail_pic(String thumbnail_pic) {
        this.thumbnail_pic = thumbnail_pic;
    }

    public String getBmiddle_pic() {
        return bmiddle_pic;
    }

    public void setBmiddle_pic(String bmiddle_pic) {
        this.bmiddle_pic = bmiddle_pic;
    }

    public String getOriginal_pic() {
        return original_pic;
    }

    public void setOriginal_pic(String original_pic) {
        this.original_pic = original_pic;
    }

    public Object getGeo() {
        return geo;
    }

    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public boolean is_paid() {
        return is_paid;
    }

    public void setIs_paid(boolean is_paid) {
        this.is_paid = is_paid;
    }

    public long getMblog_vip_type() {
        return mblog_vip_type;
    }

    public void setMblog_vip_type(long mblog_vip_type) {
        this.mblog_vip_type = mblog_vip_type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getReposts_count() {
        return reposts_count;
    }

    public void setReposts_count(long reposts_count) {
        this.reposts_count = reposts_count;
    }

    public long getComments_count() {
        return comments_count;
    }

    public void setComments_count(long comments_count) {
        this.comments_count = comments_count;
    }

    public long getAttitudes_count() {
        return attitudes_count;
    }

    public void setAttitudes_count(long attitudes_count) {
        this.attitudes_count = attitudes_count;
    }

    public long getPending_approval_count() {
        return pending_approval_count;
    }

    public void setPending_approval_count(long pending_approval_count) {
        this.pending_approval_count = pending_approval_count;
    }

    public boolean isLongText() {
        return isLongText;
    }

    public void setLongText(boolean longText) {
        isLongText = longText;
    }

    public long getMlevel() {
        return mlevel;
    }

    public void setMlevel(long mlevel) {
        this.mlevel = mlevel;
    }

    public Visible getVisible() {
        return visible;
    }

    public void setVisible(Visible visible) {
        this.visible = visible;
    }

    public long getBiz_feature() {
        return biz_feature;
    }

    public void setBiz_feature(long biz_feature) {
        this.biz_feature = biz_feature;
    }

    public long getHasActionTypeCard() {
        return hasActionTypeCard;
    }

    public void setHasActionTypeCard(long hasActionTypeCard) {
        this.hasActionTypeCard = hasActionTypeCard;
    }

    public List<String> getDarwin_tags() {
        return darwin_tags;
    }

    public void setDarwin_tags(List<String> darwin_tags) {
        this.darwin_tags = darwin_tags;
    }

    public List<String> getHot_weibo_tags() {
        return hot_weibo_tags;
    }

    public void setHot_weibo_tags(List<String> hot_weibo_tags) {
        this.hot_weibo_tags = hot_weibo_tags;
    }

    public List<String> getText_tag_tips() {
        return text_tag_tips;
    }

    public void setText_tag_tips(List<String> text_tag_tips) {
        this.text_tag_tips = text_tag_tips;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public long getUserType() {
        return userType;
    }

    public void setUserType(long userType) {
        this.userType = userType;
    }

    public long getMore_info_type() {
        return more_info_type;
    }

    public void setMore_info_type(long more_info_type) {
        this.more_info_type = more_info_type;
    }

    public String getCardid() {
        return cardid;
    }

    public void setCardid(String cardid) {
        this.cardid = cardid;
    }

    public long getPositive_recom_flag() {
        return positive_recom_flag;
    }

    public void setPositive_recom_flag(long positive_recom_flag) {
        this.positive_recom_flag = positive_recom_flag;
    }

    public long getContent_auth() {
        return content_auth;
    }

    public void setContent_auth(long content_auth) {
        this.content_auth = content_auth;
    }

    public String getGif_ids() {
        return gif_ids;
    }

    public void setGif_ids(String gif_ids) {
        this.gif_ids = gif_ids;
    }

    public long getIs_show_bulletin() {
        return is_show_bulletin;
    }

    public void setIs_show_bulletin(long is_show_bulletin) {
        this.is_show_bulletin = is_show_bulletin;
    }

    public CommentManageInfo getComment_manage_info() {
        return comment_manage_info;
    }

    public void setComment_manage_info(CommentManageInfo comment_manage_info) {
        this.comment_manage_info = comment_manage_info;
    }
}