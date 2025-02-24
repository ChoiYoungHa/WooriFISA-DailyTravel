

# 🚀데일리 트래블: 일상을 여행으로 만드는 팀 프로젝트

### 🚍개요
'데일리 트래블'은 사용자가 자유롭게 여행 장소와 일정을 공유할 수 있는 웹사이트입니다. 이 프로젝트는 팀 협업을 통해 개발되었으며, 여행을 좋아하는 사람들에게 유용한 정보를 제공하는 것을 목표로 합니다.
![image](https://github.com/user-attachments/assets/50b6b241-e5e1-4f9f-97f9-3a56ab93caee)


## 🏃‍♂️Team 

| <img src="https://avatars.githubusercontent.com/u/22585023?v=4" width="150" height="150"/> | <img src="https://avatars.githubusercontent.com/u/64997345?v=4" width="150" height="150"/> | <img src="https://avatars.githubusercontent.com/u/102151689?v=4" width="150" height="150"/> | <img src="https://avatars.githubusercontent.com/u/82391356?v=4" width="150" height="150"/> |
| :----------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------: |
|                           [@recoild](https://github.com/recoild)                           |                       [@ChoiYoungHa](https://github.com/ChoiYoungHa)                       |                            [@0lYUMA](https://github.com/0lYUMA)                             |                            [@jjeong1015](https://github.com/jjeong1015)                      |

### 🚲역할 분담

- **[0lYUMA](https://github.com/0lYUMA)**
  - **팀장**
  - 백엔드 개발
  - 게시판 서비스 개발
  - 게시판 성능 최적화
  - 이미지 서버 연동

- **[recoild](https://github.com/recoild)**
  - 팀원
  - 프론트엔드 및 백엔드 개발
  - 유저 서비스 개발
  - 게시판 성능 최적화

- **[ChoiYoungHa](https://github.com/ChoiYoungHa)**
  - 팀원
  - 백엔드 개발
  - 좋아요 서비스 개발
  - 좋아요 성능 최적화

- **[jjeong1015](https://github.com/jjeong1015)**
  - 팀원
  - 백엔드 개발
  - 댓글 서비스 개발
  - 댓글 성능 최적화


## 🌄주요 기능
- 여행 게시글 작성 및 공유
- 사용자 간 소통 기능 (댓글, 좋아요)
- DB 스키마 유지 및 버전 관리를 위한 Flyway 도입
- 구글 로그인 인증 후 인가를 담당하는 리소스 서버 기능
- 트위터 스타일의 무한 스크롤링 게시글 목록 조회 기능

## 🚀사용 기술 스택
- **프론트엔드**: TypeScript, Next.js, Tailwind CSS, ShadcnUI
- **백엔드**: Spring Boot 3, JPA
- **데이터베이스**: Oracle DB,  Redis DB
- **검색 서비스**: ELK Stack (Elasticsearch, Logstash, Kibana)
- **빌드 도구**: Gradle
- **컨테이너화**: Docker Compose


## 🏍아키텍처
![1](https://github.com/user-attachments/assets/cddfd0f4-1713-4ee6-8685-1df46b36bc5a)


## ⚙️브랜치 전략

| 브랜치 종류 | 설명 |
| --- | --- |
| main | 배포 할 수 있는 브랜치 |
| feat/post | 게시글, 해시태그 |
| feat/like | 좋아요 |
| feat/comment | 댓글 |
| feat/user | 회원 관리 |

❗️**브랜치 전략**: 각 기능별로 브랜치를 나누어 작업합니다. 예를 들어, `feature/board-management`, `feature/post-management`, `feature/admin`, `feature/user-management`, `feature/frontend` 등의 브랜치를 생성하여 각자가 담당 기능을 개발합니다.

**⚙️ 커밋 Type**

| 타입 종류 | 설명 |
| --- | --- |
| feat | 새로운 기능에 대한 커밋 |
| fix | 수정에 대한 커밋 |
| bug | 버그에 대한 커밋 |
| docs | 문서 수정 |
| style | 코드 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우 |
| test | 테스트 코드 |
| ci/cd | 빌드 업무 수정 |
| comment | 주석 추가 |
| refactor | 코드 정리 |

## 🏎ERD
![erd](https://github.com/user-attachments/assets/b5549d2e-a6bb-4151-b2fd-0ce851719771)

## 🏀스키마 통일 전략
![2024-09-21 11 34 16](https://github.com/user-attachments/assets/968a1e25-1c6b-433f-81b5-ae9238698d3f)
- flyway 라이브러리를 통해 백엔드 서버가 올라갈 때 스키마 버전 업데이트

## 🎨모니터링 전략
![2024-09-21 11 37 41](https://github.com/user-attachments/assets/c7d19dfe-6b14-49dc-8292-837151900d52)
- API별 요청횟수를 모니터링하여 자주 요청되는 API에 캐싱전략을 사용할 수 있다.
- API별 응답속도를 모니터링하여 응답속도가 느린 API를 찾아 최적화를 고민해볼 수 있다. 
## 🥇이슈해결 및 성능최적화
- 대용량 데이터 페이징 성능 개선 - [블로그 이동](https://weight-devlog.tistory.com/56)
- 좋아요 버튼 동시성 이슈(Redis Distributed Lock) - [위키이동](https://github.com/WooriFisa3-TeamOrg/daily-travel/wiki/%EC%A2%8B%EC%95%84%EC%9A%94-%EB%B2%84%ED%8A%BC-%EB%8F%99%EC%8B%9C%EC%84%B1-%EC%9D%B4%EC%8A%88(Redis-Distributed-Lock))
- JPA Lazy 전략 성능이슈(Entity 그래프)
- JWT 토큰인증 효율화
- Entity 변환 성능최적화

