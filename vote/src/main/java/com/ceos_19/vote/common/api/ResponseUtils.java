package com.ceos_19.vote.common.api;

import lombok.Getter;

@Getter
public class ResponseUtils {
    //d
    // 요청 성공인 경우
    public static <T> ApiResponseDto<T> ok(T response, ErrorResponse errorResponse)
    {
        return ApiResponseDto.<T>builder()
                .success(true)
                .response(response)
                .error(errorResponse)
                .build();
    }
    // 에러가 발생한 경우
    public static <T> ApiResponseDto<T> error(ErrorResponse response)
    {
        return ApiResponseDto.<T>builder()
                .success(false)
                .error(response) // 이 에러 리스폰스에는 status와 message가 담겨있다
                .build();
    }
}
