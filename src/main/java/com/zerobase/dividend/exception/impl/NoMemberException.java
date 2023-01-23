package com.zerobase.dividend.exception.impl;

import com.zerobase.dividend.exception.AbstractException;
import org.springframework.http.HttpStatus;

public class NoMemberException extends AbstractException {
    @Override
    public int getStatusCode() {
        return HttpStatus.NOT_FOUND.value();
    }

    @Override
    public String getMessage() {
        return "존재하지 않는 사용자입니다.";
    }
}
