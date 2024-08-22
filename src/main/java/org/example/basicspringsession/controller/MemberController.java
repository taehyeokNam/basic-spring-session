package org.example.basicspringsession.controller;

import lombok.RequiredArgsConstructor;
import org.example.basicspringsession.dto.*;
import org.example.basicspringsession.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/members")
    public ResponseEntity<MemberSaveResponseDto> saveMember(@RequestBody MemberSaveRequestDto requestDto) {
        return ResponseEntity.ok(memberService.saveMember(requestDto));
    }

    @GetMapping("/members")
    public ResponseEntity<List<MemberSimpleResponseDto>> getMembers() {
        return ResponseEntity.ok(memberService.getMembers());
    }

    @PostMapping("/members/{memberId}")
    public ResponseEntity<MemberUpdateResponseDto> updateMember(@PathVariable Long memberId, @RequestBody MemberUpdateRequestDto requestDto) {
        return ResponseEntity.ok(memberService.updateMember(memberId, requestDto));
    }
}
