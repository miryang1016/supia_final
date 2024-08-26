package com.forest.supia.message.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class MessageResponse {
    private long messageId;
    private String fromMemberNickname;
    private String toMemberNickname;
    private String fromMemberImg;
    private String toMemberImg;
    private String content;
    private boolean isCheck;
    private int category;
    private LocalDateTime sentTime;
}
