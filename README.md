# 🚀 데일리 트래블: 일상을 여행으로 만드는 팀 프로젝트

### 📝 개요
'데일리 트래블'은 사용자가 자유롭게 여행 장소와 일정을 공유할 수 있는 웹사이트입니다. 이 프로젝트는 팀 협업을 통해 개발되었으며, 여행을 좋아하는 사람들에게 유용한 정보를 제공하는 것을 목표로 합니다.  
![image](https://github.com/user-attachments/assets/50b6b241-e5e1-4f9f-97f9-3a56ab93caee)

## 👥 Team

| <img src="https://avatars.githubusercontent.com/u/22585023?v=4" width="150" height="150"/> | <img src="https://avatars.githubusercontent.com/u/64997345?v=4" width="150" height="150"/> | <img src="https://avatars.githubusercontent.com/u/102151689?v=4" width="150" height="150"/> | <img src="https://avatars.githubusercontent.com/u/82391356?v=4" width="150" height="150"/> |
| :----------------------------------------------------------------------------------------: | :----------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------: | :-----------------------------------------------------------------------------------------: |
|                           [@recoild](https://github.com/recoild)                           |                       [@ChoiYoungHa](https://github.com/ChoiYoungHa)                       |                            [@0lYUMA](https://github.com/0lYUMA)                             |                            [@jjeong1015](https://github.com/jjeong1015)                      |

### 🛠 역할 분담

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

## 🌟 주요 기능
- 여행 게시글 작성 및 공유  
- 사용자 간 소통 기능 (댓글, 좋아요)  
- DB 스키마 유지 및 버전 관리를 위한 Flyway 도입  
- 구글 로그인 인증 후 인가를 담당하는 리소스 서버 기능  
- 트위터 스타일의 무한 스크롤링 게시글 목록 조회 기능  

## ⚙️ 사용 기술 스택
- **프론트엔드**: TypeScript, Next.js, Tailwind CSS, ShadcnUI  
- **백엔드**: Spring Boot 3, JPA  
- **데이터베이스**: Oracle DB, Redis DB  
- **검색 서비스**: ELK Stack (Elasticsearch, Logstash, Kibana)  
- **빌드 도구**: Gradle  
- **컨테이너화**: Docker Compose  

## 🏗 아키텍처
![1](https://github.com/user-attachments/assets/cddfd0f4-1713-4ee6-8685-1df46b36bc5a)

## 🌿 브랜치 전략

| 브랜치 종류      | 설명           |
|------------------|----------------|
| main            | 배포 할 수 있는 브랜치 |
| feat/post       | 게시글, 해시태그      |
| feat/like       | 좋아요             |
| feat/comment    | 댓글              |
| feat/user       | 회원 관리          |

❗️ **브랜치 전략**: 각 기능별로 브랜치를 나누어 작업합니다. 예를 들어, `feature/board-management`, `feature/post-management`, `feature/admin`, `feature/user-management`, `feature/frontend` 등의 브랜치를 생성하여 각자가 담당 기능을 개발합니다.

**⚙️ 커밋 Type**

| 타입 종류 | 설명                       |
|-----------|----------------------------|
| feat      | 새로운 기능에 대한 커밋     |
| fix       | 수정에 대한 커밋           |
| bug       | 버그에 대한 커밋           |
| docs      | 문서 수정                 |
| style     | 코드 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우 |
| test      | 테스트 코드               |
| ci/cd     | 빌드 업무 수정            |
| comment   | 주석 추가                 |
| refactor  | 코드 정리                 |

## 📊 ERD
![erd](https://github.com/user-attachments/assets/b5549d2e-a6bb-4151-b2fd-0ce851719771)

## 🔄 스키마 통일 전략
![2024-09-21 11 34 16](https://github.com/user-attachments/assets/968a1e25-1c6b-433f-81b5-ae9238698d3f)
- Flyway 라이브러리를 통해 백엔드 서버가 올라갈 때 스키마 버전 업데이트  

## 📈 모니터링 전략
![2024-09-21 11 37 41](https://github.com/user-attachments/assets/c7d19dfe-6b14-49dc-8292-837151900d52)
- API별 요청 횟수를 모니터링하여 자주 요청되는 API에 캐싱 전략 적용 가능  
- API별 응답 속도를 모니터링하여 느린 API를 찾아 최적화 검토  

## 🛠 이슈 해결 및 성능 최적화

### 🔒 좋아요 버튼 동시성 이슈 (Redis Distributed Lock)
![2024-09-21 12 32 16](https://github.com/user-attachments/assets/fa942b74-3f0e-435b-8968-7b0985f95645)
- 예금과 같은 공유 자원에 사용자가 동시에 입출금 트랜잭션을 실행하면 데이터 불일치 발생 가능.  
- 예: 통장 잔고 100만 원 → 사용자1이 100만 원 입금, 사용자2가 50만 원 입금 시, 레이스 컨디션으로 250만 원이 아닌 200만 원 기록.  
- **문제**: 트랜잭션 격리 실패로 인한 동시성 이슈.  

![2024-09-21 12 40 34](https://github.com/user-attachments/assets/a62b7d3e-13cb-4cec-a2d8-a9ad79318970)
- 프로젝트에서도 "좋아요 수"가 공유 자원으로, 100명이 동시에 좋아요를 누르면 레이스 컨디션 발생.  
- 결과: 100 대신 8로 기록되는 문제 확인.  

#### ⚖️ 기술 비교
동시성 문제를 해결하기 위해 RDB의 Pessimistic Lock, Optimistic Lock과 Redis의 Lettuce, Redisson을 비교했습니다.

| **방식/구현**         | **설명**                                                                                 | **확장성**                                                                                     | **성능**                                                                                     | **장점**                                                                                           | **단점**                                                                                           |
|-----------------------|-----------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------|
| **Pessimistic Lock**  | 자원에 접근 전 락 획득으로 충돌 방지 (예: `SELECT FOR UPDATE`)                          | - 분산 시스템에서 확장성 제한<br>- 다중 노드 환경에서 네트워크 지연 증가                        | - 충돌 빈도 높을 시 성능 저하<br>- 단일 노드 빠름, 분산 환경 느림                            | - 데이터 일관성 강력<br>- 충돌 빈발 시 적합<br>- 단순 트랜잭션 안정적                        | - 성능 병목 가능성<br>- 확장성 제한<br>- 데드락 위험                                        |
| **Optimistic Lock**   | 충돌 드물다고 가정, 수정 시 버전 체크 (예: 버전 번호)                                   | - 높은 확장성: 락 미획득으로 병목 적음<br>- 분산 시스템 병렬 처리 용이                         | - 충돌 드물면 빠름<br>- 충돌 빈발 시 재시도 비용 증가                                         | - 병렬 처리 성능 우수<br>- 락 비용 절감<br>- 분산 시스템 유연성                              | - 충돌 빈발 시 재시도 복잡<br>- 일관성 약화 가능<br>- 사용자 경험 저하                       |
| **Redis Lettuce**     | 경량, 비동기/리액티브 Redis 클라이언트                                                  | - 높은 확장성: 경량 구조로 클러스터 적합<br>- 노드 장애 시 재발견 기능                        | - 빠른 성능: 오버헤드 적음<br>- 비동기 모델로 병렬 처리 효율적                               | - 단순 구조로 사용 쉬움<br>- 비동기 지원으로 최적화<br>- 클러스터 설정 용이                   | - 고급 기능 부족<br>- 구현 복잡성 증가<br>- 커뮤니티 지원 제한                              |
| **Redis Redisson**    | 고급 Redis 클라이언트 (분산 락, 캐싱 등 제공)                                           | - 높은 확장성: RedLock으로 다중 노드 관리 용이<br>- 클라우드 통합 가능                       | - 성능 우수: 캐싱 및 고급 기능 최적화<br>- Lettuce보다 약간 느릴 수 있음                     | - 풍부한 기능 (분산 락, JCache 등)<br>- 사용 편의성 높음<br>- 안정성 강함                    | - Lettuce보다 무거움<br>- 설정 복잡성 높음<br>- 성능 약간 저하 가능                          |

- **결론**: RDB Lock은 성능이 느리고 병목 가능성 높아 제외. Redis는 확장성과 사용 편의성 우수하여 선택. Lettuce vs Redisson 비교 후 Redisson 채택.

#### 🔐 Redisson 선택 이유
![2024-09-21 14 43 32](https://github.com/user-attachments/assets/a50110fa-6d91-4fb7-a82d-86f6fb2ab7ae)
- **Lettuce 단점**: 스핀락 구현 시 timeout 미지정으로 무한 점유 가능성, 반복 요청으로 Redis 부하 증가.  

![2024-09-21 14 46 56](https://github.com/user-attachments/assets/dc213751-e4be-4c15-b770-dcd8f6dbe9b2)
- **Redisson 장점**: Lock 획득 후 사용 완료 시 Pub/Sub으로 알림, 다른 스레드가 지속 요청 없이 대기 가능 → Redis 부하 감소, 효율적 분산 락 구현.

#### 🛠 구현 방식
![Image](https://github.com/user-attachments/assets/d7750ebc-f3cc-47f3-ba8c-780e4b86c4e2)
- 분산 락 미적용 시, 100명 동시 좋아요 테스트 실패.  

**RedissonLockLikeFacade.java**  
![Image](https://github.com/user-attachments/assets/b1e86b3c-309c-44ba-a8cb-5ff7422325e4)
- `redissonClient`로 Lock 획득 후 `likeToggle` 실행하도록 설정.  

![Image](https://github.com/user-attachments/assets/d966b096-4b0f-4e16-a3ee-cd7682043c5c)
- 테스트 코드 수정 후 재실행.  

![Image](https://github.com/user-attachments/assets/817eace5-d285-40fa-b66c-294613d84c33)
- 결과: 테스트 성공, Redisson 분산 락으로 동시성 이슈 해결.

### 📈 대용량 데이터 페이징 성능 개선 (Spring Data JPA + PostgreSQL)

#### 📦 대규모 데이터 Insert 방식 선택 및 구현
Spring Data JPA와 PostgreSQL로 5천만 건 데이터 페이징 구현을 위해 더미 데이터 삽입 과정을 최적화했습니다.

##### 🔍 Insert 방식 선택
- **순수 JDBC Insert**  
  - **장점**: 최적화 시 삽입 속도 가장 빠름  
  - **단점**: SQL 직접 관리, 직렬화/재시도 로직 직접 구현  
- **Spring Batch (JPA)**  
  - **장점**: 추상화된 API, Chunk 처리 및 Skip 로직 내장, 스케줄링 가능  
  - **단점**: ORM 오버헤드로 삽입 속도 느림  
- **결정**: 성능 최적화 목표로 JDBC 선택 (`reWriteBatchedInserts=true` 적용 시 1만 건 4.3초 vs JPA 9초).

##### ⚙️ 환경 설정
**PostgreSQL 연결**  
```
jdbc:postgresql://localhost:5432/postgres?reWriteBatchedInserts=true&prepareThreshold=3
```

**postgresql.conf 최적화**  
```conf
shared_buffers = 4GB          # 메모리 25% (16GB 기준)
work_mem = 2MB               # 정렬/해시 작업
maintenance_work_mem = 1GB   # 인덱스 생성
max_wal_size = 4GB           # WAL 크기 증가
checkpoint_timeout = 30min   # 체크포인트 간격
synchronous_commit = off     # 비동기 커밋
wal_buffers = 16MB
max_connections = 50         # 연결 수 제한
```
- **최적화 포인트**: 비동기 커밋으로 I/O 부하 감소, WAL 크기 조정.  
- **제약**: 여유 RAM 4GB로 공유 버퍼 제한.  

![Image](https://github.com/user-attachments/assets/9346b4be-b1ab-4213-ac6d-6e0768439cf6)

**하드웨어 제약**  
- **사양**: RAM 16GB (여유 4GB), 4코어 CPU, SSD 30GB 남음  
- **계산**: 평균 행 크기 100바이트 → 30GB SSD로 약 3억 건 가능, WAL/인덱스 등 고려 시 2억 건 가정.

##### 🛠 구현
**Gradle 설정**  
```gradle
dependencies {
    implementation 'org.postgresql:postgresql:42.7.5'
}
```

**Insert 코드**  
```java
package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres?reWriteBatchedInserts=true";
        String user = "user01";
        String password = "password";
        int BATCH_SIZE = 1000;

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO post (post_title, post_content, place_name, likes_count, thumbnail, latitude, longitude, created_at, updated_at, users_id) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, now(), now(), ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                conn.setAutoCommit(false);
                Random random = new Random();
                long dummyUserId = 1L;

                for (int i = 1; i <= 50000000; i++) {
                    pstmt.setString(1, "제목 " + i);
                    pstmt.setString(2, "내용 " + i);
                    pstmt.setString(3, "서울 " + random.nextInt(1000));
                    pstmt.setInt(4, random.nextInt(10000));
                    pstmt.setString(5, null);
                    pstmt.setDouble(6, random.nextDouble() * 180 - 90);
                    pstmt.setDouble(7, random.nextDouble() * 360 - 180);
                    pstmt.setLong(8, dummyUserId);
                    pstmt.addBatch();

                    if (i % BATCH_SIZE == 0) {
                        pstmt.executeBatch();
                        conn.commit();
                        System.out.println("Inserted " + i + " rows.");
                    }
                }
                pstmt.executeBatch();
                conn.commit();
                System.out.println("데이터 삽입 완료.");
            }
        } catch (Exception e) {
            System.out.println("Insertion failed!");
            e.printStackTrace();
        }
    }
}
```
![Image](https://github.com/user-attachments/assets/0a381823-1479-4d8c-8717-736406af5f1e)
![Image](https://github.com/user-attachments/assets/14082a46-c515-41fa-92dd-4ead7fa41c7d)

**삽입 결과**  
- **1천만 건**: 약 5분 44초  
- **5천만 건**: 약 23분 19초  
- **디스크 사용량**: 30GB → 24GB (6GB 소모, 10개 컬럼 5천만 건 기준).

##### 🚨 성능 문제 발견
![Image](https://github.com/user-attachments/assets/06e9167a-52b4-431a-b43f-d554367a431a)
![Image](https://github.com/user-attachments/assets/94e2f144-97f0-4635-acca-60ad3eff81cb)
![Image](https://github.com/user-attachments/assets/0d4724f6-a8d0-4c1e-a901-b62051e2e809)
- 무한 스크롤 페이징 구현 중 초기 20개 게시물 조회 시 CPU/Memory 100% 문제 발생.  
- **원인**:  
  1. 인덱스 미적용 → 테이블 풀스캔  
  2. Spring Data JPA의 N+1 문제  
![Image](https://github.com/user-attachments/assets/74bdcee8-78e0-4371-8dbf-c4e6de0926d8)

##### ⚡ 성능 최적화
###### 1️⃣ 인덱스 생성 및 쿼리 실행 계획 분석
- **문제**: `Page` 객체 사용 시 `count()`로 풀스캔 발생.  
- **해결**: `Page` → `Slice`로 변경 (`Slice`는 카운트 없이 동작).  
```java
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Slice<Post> findAllByOrderByCreatedAtDesc(Pageable pageable);
}
```
- **인덱스 생성**:  
```sql
CREATE INDEX idx_post_created_at ON post(created_at);
```
- **결과**: `Index Scan` 적용, 2천만 건 조회 9초 소요.  
![Image](https://github.com/user-attachments/assets/e53d691d-5874-407a-ae8d-25f154474c94)

###### 2️⃣ API 최적화
- **문제 코드**:  
```java
Page<Post> postPageList = postRepository.findAllByOrderByCreatedAtDesc(
    PageRequest.of(postPagingRequest.getPage(), postPagingRequest.getCount()));
```
- `findAll()`로 전체 데이터 로드 후 정렬 → 성능 저하.  
- **수정**: `Slice` + 인덱스 활용.  
![Image](https://github.com/user-attachments/assets/6c703167-7563-4b17-a99d-96ffd13eec35)
![Image](https://github.com/user-attachments/assets/bf96476b-065b-4f74-b12e-d5e149456f18)

###### ✅ 최종 결과
- 페이징 정상 동작, **API 응답 속도**: 1페이지(20건) 254ms.  
- N+1 해결 시 추가 개선 가능성 확인.  
![Image](https://github.com/user-attachments/assets/cb68cbc8-e300-4b90-a1c7-e0a8eb540cc0)

#### 🔧 N+1 문제 해결하기
게시물 조회 시 `postId`로 `Hashtag`와 `Image` 엔티티를 불러오는 로직에서 N+1 문제 발생.  
![Image](https://github.com/user-attachments/assets/431d1239-cdb9-44f6-8f15-7d6bd67535ad)

##### 🚨 N+1 문제 발생 원인
- `postHashtagRepository.findByPostId(post.getId())`: 각 게시물마다 개별 쿼리 실행.  
- `post.getId()`는 1차 캐시 사용, 하지만 `findByPostId()`는 반복 쿼리로 성능 저하.  

##### 🛠 해결 방법
![Image](https://github.com/user-attachments/assets/d6bbe471-98cd-4d1a-bf25-9ead1b480777)
- `findByPostId` → `findByPostIdIn`으로 변경, 여러 `postId`를 한 번에 조회.  
```java
@Repository
public interface PostHashtagRepository extends JpaRepository<PostHashtag, Long> {
    List<PostHashtag> findByPostIdIn(List<Long> postIds);
}

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByPostIdIn(List<Long> postIds);
}
```

###### 🔄 실행 순서
![Image](https://github.com/user-attachments/assets/738b2a15-b9dd-4def-8f58-0eb6c2b99024)
![Image](https://github.com/user-attachments/assets/7a1f6ec0-898e-4304-aa19-0aca42394f94)
1. 첫 페이지 조회:  
   ```sql
   SELECT * FROM post ORDER BY created_at DESC LIMIT 20 OFFSET 0
   ```
   - `Slice`로 `Post` 리스트 생성.  
2. `findByPostIdIn`으로 `Hashtag` 조회 (1쿼리).  
3. `findByPostIdIn`으로 `Image` 조회 (1쿼리).  

###### 📊 쿼리 실행 비교
- **최적화 전**: `Post` 1번, `Image` 20번, `Hashtag` 20번 (총 41번).  
- **최적화 후**: `Post` 1번, `Image` 1번, `Hashtag` 1번 (총 3번).  
![Image](https://github.com/user-attachments/assets/a6f808a0-20ac-4f38-98bf-2bb6c1e53474)
![Image](https://github.com/user-attachments/assets/fd355047-95af-49f9-8883-50720cfd42b5)

###### ✅ 성능 개선 결과
- **1차 최적화**: 응답 없음 → 254ms (`Slice` + 인덱스).  
- **2차 최적화**: 254ms → 69ms (N+1 해결).  

##### 📌 정리 및 교훈
- 대용량 데이터는 인덱스 활용 필수.  
- 페이징 객체(`Page` vs `Slice`) 특성 파악 필요.  
- `EXPLAIN ANALYZE`로 풀스캔/인덱스 스캔 확인.  
- N+1 방지를 위해 대용량 더미 데이터 테스트 추천.  

## 📚 참고 자료
- [Java JDBC PostgreSQL Batch Insert](https://www.javaguides.net/2020/02/java-jdbc-postgresql-batch-insert.html)  
- [13 Tips to Improve PostgreSQL Insert Performance](https://www.timescale.com/blog/13-tips-to-improve-postgresql-insert-performance)  
- [PostgreSQL Explain](https://www.postgresguide.com/performance/explain/) 
