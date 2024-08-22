package org.example.basicspringsession.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.basicspringsession.dto.MemberSaveRequestDto;
import org.example.basicspringsession.dto.MemberSaveResponseDto;
import org.example.basicspringsession.entity.Member;
import org.example.basicspringsession.repository.MemberRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    @Transactional
    public MemberSaveResponseDto saveMember(MemberSaveRequestDto requestDto) {
        Member newMember = new Member(requestDto.getName());
        Member savedMember = memberRepository.save(newMember);

        return new MemberSaveResponseDto(savedMember.getId(), savedMember.getName());
    }
}
