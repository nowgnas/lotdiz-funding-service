package com.lotdiz.fundingservice.service.client;

import com.lotdiz.fundingservice.dto.request.MemberPointUpdateRequestDto;
import com.lotdiz.fundingservice.utils.SuccessResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="memberServiceClient", url="${endpoint.member-service}")
public interface MemberServiceClient {
  @PostMapping("/members/use-point")
  SuccessResponse usePoint(@RequestBody MemberPointUpdateRequestDto memberPointUpdateRequestDto);
}
