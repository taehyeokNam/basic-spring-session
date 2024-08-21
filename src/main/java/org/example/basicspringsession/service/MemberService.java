package org.example.basicspringsession.service;

import lombok.RequiredArgsConstructor;
import org.example.basicspringsession.entity.Member;
import org.example.basicspringsession.repository.MemberRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
}
