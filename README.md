# Spring Data Jpa - 회원가입 실습

## 프로젝트 소개
간단한 회원가입 기능을 제공하는 스프링 부트 애플리케이션입니다.

## 기능 요약

회원가입 REST API 제공
사용자 정보 데이터베이스 저장
중복 사용자명 확인

## 프로젝트 구조
![image](https://github.com/user-attachments/assets/632a97ba-e8f6-42a4-8ac9-ff3780ca0a7f)

## 주요 컴포넌트 설명

컨트롤러 (Controller)
- JoinController: /join 엔드포인트로 회원가입 요청을 받아 서비스로 전달


도메인 모델 (Domain)
- UserEntity: 사용자 정보를 저장하는 JPA 엔티티


데이터 전송 객체 (DTO)
- JoinDto: 클라이언트로부터 받는 회원가입 정보


레포지토리 (Repository)
- UserRepository: JPA를 활용한 데이터베이스 접근




서비스 (Service)
- JoinService: 회원가입 처리 로직








