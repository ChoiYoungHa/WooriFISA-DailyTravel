

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

### 좋아요 버튼 동시성 이슈(Redis Distributed Lock)
![2024-09-21 12 32 16](https://github.com/user-attachments/assets/fa942b74-3f0e-435b-8968-7b0985f95645)

- 예금이라는 공유자원에 사용자가 동시에 예금을 입금하고 출금하는 트랜잭션이 발생하면 데이터가 불일치될 수 있습니다.
- 위 그림을 살펴보면 통장잔고에 100만원이 있었고 사용자1이 100만원을 입금했습니다.
- 사용자2도 50만원을 입금했으니 250만원이 되어야 하는데 **레이스 컨디션**이 발생했기 때문에 200만원이 되었습니다.
- 이는 각 **트랜잭션을 격리**하지 못해서 발생하는 **동시성이슈**입니다.

![2024-09-21 12 40 34](https://github.com/user-attachments/assets/a62b7d3e-13cb-4cec-a2d8-a9ad79318970)

마찬가지로 이번 프로젝트에서도 "좋아요 수"를 기록하는 데이터베이스의 속성이 공유자원이 되어 100명의 유저가 동시에 좋아요를 누른다면 레이스 컨디션이 발생할 수 밖에 없는 상황입니다.
- 100명의 유저가 동시에 좋아요 버튼을 눌렀을 때 100이 아닌 8이 나온 것을 확인할 수 있습니다.
- 공유된 자원을 동일한 시점에 접근하여 레이스 컨디션이 발생했습니다.

#### 기술비교
이 문제를 해결하기 위해 저희는 RDB에서 제공하는 Pessimistic Lock, Optimistic Lock 방식과 Redis의 Lettuce, Redis Redisson 구현방식을 두고 현재 상황과 장단점을 생각하며 기술을 선택했습니다.

| **방식/구현**         | **설명**                                                                                 | **확장성**                                                                                     | **성능**                                                                                     | **장점**                                                                                           | **단점**                                                                                           |
|-----------------------|-----------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------|
| **Pessimistic Lock**  | 자원에 접근하기 전에 락을 획득하여 충돌을 사전에 방지 (예: 데이터베이스 `SELECT FOR UPDATE`) | - 분산 시스템에서 확장성 제한: 락이 장기 유지되면 병목현상 발생<br>- 다중 노드 환경에서는 네트워크 지연 증가 | - 충돌 빈도가 높을 경우 성능 저하: 락 대기 시간 증가<br>- 단일 노드에서는 빠를 수 있으나 분산 환경에서 느림 | - 데이터 일관성 보장 강력<br>- 충돌이 자주 발생할 때 적합<br>- 단순한 트랜잭션에서 안정적 | - 성능 병목현상 가능성 높음<br>- 네트워크 지연으로 인해 확장성 제한<br>- 데드락 위험 존재 |
| **Optimistic Lock**   | 충돌이 드물다고 가정하고, 수정 시 버전 체크로 충돌 감지 (예: 버전 번호 또는 타임스탬프) | - 높은 확장성: 락을 사전에 획득하지 않아 병목현상 적음<br>- 분산 시스템에서 병렬 처리 용이 | - 충돌이 드물 경우 빠름: 락 대기 시간 없음<br>- 충돌이 자주 발생하면 재시도 비용 증가로 성능 저하 | - 병렬 처리 성능 우수<br>- 리소스 락 비용 절감<br>- 분산 시스템에서 유연성 제공 | - 충돌 빈도가 높으면 재시도 로직 복잡해짐<br>- 데이터 일관성 보장 약화 가능성<br>- 사용자 경험 저하 (재시도 필요 시) |
| **Redis Lettuce**     | Redis를 위한 경량, 비동기/리액티브 Java 클라이언트 (낮은 수준 API 제공)               | - 높은 확장성: 경량 구조로 클러스터 환경 적합<br>- 노드 장애 시 재발견 기능으로 확장성 유지 | - 빠른 성능: 경량 설계로 오버헤드 적음<br>- 비동기/리액티브 모델로 병렬 처리 효율적 | - 경량 & 단순 구조로 학습 및 사용 쉬움<br>- 비동기/리액티브 지원으로 성능 최적화<br>- 클러스터 설정 용이 | - 고급 기능(분산 락, 캐싱) 부족<br>- 구현 복잡성 증가 (사용자 정의 로직 필요)<br>- 커뮤니티 지원 제한적 |
| **Redis Redisson**    | Redis를 위한 고급 Java 클라이언트 (분산 락, 컬렉션, 캐싱 등 풍부한 기능 제공)         | - 높은 확장성: RedLock 등 분산 락으로 다중 노드 관리 용이<br>- 클라우드 서비스 통합 가능 | - 성능 우수: 캐싱(near cache) 및 고급 기능으로 최적화<br>- 하지만 Lettuce보다 약간 느릴 수 있음 | - 풍부한 기능 (분산 락, JCache, 트랜잭션 등)<br>- 사용 편의성 높음 (Java 객체 활용)<br>- 확장성 및 안정성 강함 | - Lettuce보다 무거움 (리소스 소모 증가)<br>- 학습 곡선 및 설정 복잡성 높음<br>- 성능 면에서 Lettuce보다 느릴 수 있음 |

RDB Lock은 Redis에 비해 성능이 느리고, 충돌 및 병목현상을 고려한 설계가 필요해서 구현이 복잡하다고 생각되어 Redis를 선택했습니다.
Redis는 자바에서 쉽게 사용할 수 있도록 고급 클라이언트(분산 락, 컬렉션, 캐싱 등 풍부한 기능 제공)를 제공하고, 높은 확장성을 제공합니다.
Redis로 구현 한다면 Lettuce VS Redisson의 장단점을 고려하여 선택해야 했습니다.


![2024-09-21 14 43 32](https://github.com/user-attachments/assets/a50110fa-6d91-4fb7-a82d-86f6fb2ab7ae)
- 처음엔 가볍고 구현하기 쉬운 Lettuce로 스핀락을 구현하려고 했으나 timeout이 따로 지정되어 있지 않아 Lock 무한 점유 가능성을 고려했습니다.
- 또한 Lock을 획득 할 때까지 반복요청을 지속하기에 Redis에 부하가 걸릴 수 있습니다.


![2024-09-21 14 46 56](https://github.com/user-attachments/assets/dc213751-e4be-4c15-b770-dcd8f6dbe9b2)
- Reddisson 분산락 방식은 Thread가 Lock을 획득한 후 사용을 마치면 Channel에 알립니다.
- Redis의Pub/Sub 방식을 사용하기 때문에 다른 스레드들은 채널만 Subscribe 상태를 유지한다면 Lock을 계속 요청하지 않아도 됩니다.
- 이는 레디스의 부하가 줄어들고 효율적으로 분산락 구현이 가능합니다. 이에 Reddisson 방식을 채택하여 구현했습니다.

#### 🥚구현방식

![Image](https://github.com/user-attachments/assets/d7750ebc-f3cc-47f3-ba8c-780e4b86c4e2)

먼저 분산락을 구현하지 않고 100명의 유저가 동시에 좋아요를 눌렀을 때 테스트코드가 실패하는 상황입니다.

**RedissonLockLikeFacade.Java**
![Image](https://github.com/user-attachments/assets/b1e86b3c-309c-44ba-a8cb-5ff7422325e4)

이후 RedissonLockLikeFacade 클래스에서 redissonClient을 통해 Lock을 얻어야만 좋아요 Toggle 메서드를 실행할 수 있도록 설정합니다.


![Image](https://github.com/user-attachments/assets/d966b096-4b0f-4e16-a3ee-cd7682043c5c)

테스트코드를 기존 likeService.likeToggle 메서드에서 redissonLockLikeFacade.likeToggle로 변경하여 다시 테스트를 진행합니다.

![Image](https://github.com/user-attachments/assets/817eace5-d285-40fa-b66c-294613d84c33)

해당 테스트는 성공했고, 스프링에서 Redis의 Redisson 분산락 라이브러리를 사용하여 동시성 이슈를 제어할 수 있습니다.


### 🚀 대용량 데이터 페이징 성능 개선(Spring Data JPA + PostgreSQL)


### 대규모 데이터 Insert 방식 선택 및 구현

Spring Data JPA와 PostgreSQL을 사용해 5천만 건 데이터 페이징을 구현하기 위해 더미 데이터를 삽입하는 과정을 최적화한 경험을 공유합니다.

## Insert 방식 선택

더미 데이터 5천만 건을 삽입하기 위해 JPA와 JDBC를 비교했습니다. 리서치 결과, JPA보다 JDBC가 성능 면에서 월등히 우수하다는 결론을 내렸습니다.

### 순수 JDBC Insert
- **장점**: 최적화 시 삽입 속도가 가장 빠름
- **단점**: 
  - SQL 직접 관리 필요
  - 직렬화/재시도 로직 직접 구현

### Spring Batch (JPA)
- **장점**: 
  - 추상화된 API 제공
  - Chunk 처리, Skip 로직 내장
  - 스케줄링 가능
- **단점**: ORM 오버헤드로 삽입 속도 느림

**결정**: 성능 최적화가 목표였기에 JDBC를 선택했습니다.  
- `reWriteBatchedInserts=true` 적용 시 1만 건 삽입에 4.3초 (JPA 최적화 시 9초). 약 2배 이상 차이로 JDBC 채택.

## 환경 설정

### PostgreSQL 연결
```
jdbc:postgresql://localhost:5432/postgres?reWriteBatchedInserts=true&prepareThreshold=3
```

### postgresql.conf 최적화
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
- **제약**: 노트북 여유 RAM 4GB로 공유 버퍼 크기 제한.

![Image](https://github.com/user-attachments/assets/9346b4be-b1ab-4213-ac6d-6e0768439cf6)
### 하드웨어 제약
- **사양**: RAM 16GB (여유 4GB), 4코어 CPU, SSD 30GB 남음
- **계산**: 평균 행 크기 100바이트  
  - 30GB SSD → 약 3억 건 가능하다는 결론
  - WAL, 인덱스, 메타데이터 고려 시 2억 건으로 가정

## 구현

### Gradle 설정
```gradle
dependencies {
    implementation 'org.postgresql:postgresql:42.7.5'
}
```

### Insert 코드
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

### 삽입 결과
- **1천만 건**: 약 5분 44초
- **5천만 건**: 약 23분 19초
- **디스크 사용량**: 30GB → 24GB (6GB 소모)  
  - 10개 컬럼, 5천만 건 6GB (데이터 길이에 따라 변동)

## 성능 문제 발견

![Image](https://github.com/user-attachments/assets/06e9167a-52b4-431a-b43f-d554367a431a)
![Image](https://github.com/user-attachments/assets/94e2f144-97f0-4635-acca-60ad3eff81cb)
![Image](https://github.com/user-attachments/assets/0d4724f6-a8d0-4c1e-a901-b62051e2e809)


무한 스크롤 페이징 구현 중 문제 발생:
- 초기 20개 게시물 조회 시 CPU/Memory 100%에 근접.
- **원인**: 
  1. 인덱스 미적용 → 테이블 풀스캔
  2. Spring Data JPA의 N+1 문제

![Image](https://github.com/user-attachments/assets/74bdcee8-78e0-4371-8dbf-c4e6de0926d8)


## 성능 최적화

### 1. 인덱스 생성 및 쿼리 실행 계획 분석
- **문제**: `Page` 객체 사용 시 `count()`로 테이블 풀스캔 발생.
- **해결**: `Page` → `Slice`로 변경  
  - `Slice`는 전체 개수 카운트 없이 동작, 풀스캔 방지.

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
- **결과**: 실행 계획 확인 시 `Index Scan` 적용, 2천만 건 조회 9초 소요

![Image](https://github.com/user-attachments/assets/e53d691d-5874-407a-ae8d-25f154474c94)

### 2. API 최적화
- **문제 코드**:
```java
Page<Post> postPageList = postRepository.findAllByOrderByCreatedAtDesc(
    PageRequest.of(postPagingRequest.getPage(), postPagingRequest.getCount()));
```
- `findAll()`로 전체 데이터 로드 후 정렬 → 성능 저하.

- **수정**: `Slice` 사용 및 인덱스 활용으로 개선.

![Image](https://github.com/user-attachments/assets/6c703167-7563-4b17-a99d-96ffd13eec35)
![Image](https://github.com/user-attachments/assets/bf96476b-065b-4f74-b12e-d5e149456f18)

### 최종 결과
- 서버 재실행 후 페이징 정상 동작.
- **API 응답 속도**: 1페이지(20건) 조회 시 254ms.
- N+1 문제 해결 시 추가 개선 가능성이 있음.


![Image](https://github.com/user-attachments/assets/cb68cbc8-e300-4b90-a1c7-e0a8eb540cc0)
## N+1 문제 해결하기
게시물 조회 시 `postId`를 기반으로 `Hashtag`와 `Image` 엔티티를 불러오는 로직에서 N+1 문제가 발생했습니다.

![Image](https://github.com/user-attachments/assets/431d1239-cdb9-44f6-8f15-7d6bd67535ad)
### N+1 문제 발생 원인
- `postHashtagRepository.findByPostId(post.getId())`: 각 게시물마다 개별 쿼리가 실행됨.
- `post.getId()`는 1차 캐시에 존재해 추가 조회가 없지만, `findByPostId()`는 각 `Hashtag` 엔티티를 가져오기 위해 별도 쿼리를 반복 실행.
- 결과적으로 쿼리 수가 급증하며 성능 저하.


### 해결 방법
![Image](https://github.com/user-attachments/assets/d6bbe471-98cd-4d1a-bf25-9ead1b480777)
`findByPostId`를 `findByPostIdIn`으로 수정해 여러 `postId`를 한 번에 조회하도록 변경했습니다.

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

#### 실행 순서
![Image](https://github.com/user-attachments/assets/738b2a15-b9dd-4def-8f58-0eb6c2b99024)
![Image](https://github.com/user-attachments/assets/7a1f6ec0-898e-4304-aa19-0aca42394f94)
1. 첫 페이지 조회:  
   ```sql
   SELECT * FROM post ORDER BY created_at DESC LIMIT 20 OFFSET 0
   ```
   - `Slice` 객체에 `Post` 엔티티 리스트 생성.
2. `findByPostIdIn`으로 `Hashtag` 조회: 20개 `postId`를 한 번에 처리 (1쿼리).
3. `findByPostIdIn`으로 `Image` 조회: 20개 `postId`를 한 번에 처리 (1쿼리).

#### 쿼리 실행 비교
- **최적화 전**: 1페이지 → `Post` 쿼리 1번, `Image` 쿼리 20번, `Hashtag` 쿼리 20번 (총 41번).
- **최적화 후**: 1페이지 → `Post` 쿼리 1번, `Image` 쿼리 1번, `Hashtag` 쿼리 1번 (총 3번).

![Image](https://github.com/user-attachments/assets/a6f808a0-20ac-4f38-98bf-2bb6c1e53474)
![Image](https://github.com/user-attachments/assets/fd355047-95af-49f9-8883-50720cfd42b5)
### 성능 개선 결과
- **1차 최적화**: 테이블 풀스캔으로 응답 없음 → `Slice` + 인덱스 적용으로 254ms.
- **2차 최적화**: N+1 해결 후 254ms → 69ms.

### 정리 및 교훈
- 대용량 데이터는 인덱스 활용 필수.
- 페이징 객체(`Page` vs `Slice`)의 특성을 파악해 사용.
- `EXPLAIN ANALYZE`로 풀스캔/인덱스 스캔 여부 확인.
- N+1 문제를 방지하려면 대용량 더미 데이터로 사전 테스트 필요성.


## 참고 자료
- [Java JDBC PostgreSQL Batch Insert](https://www.javaguides.net/2020/02/java-jdbc-postgresql-batch-insert.html)
- [13 Tips to Improve PostgreSQL Insert Performance](https://www.timescale.com/blog/13-tips-to-improve-postgresql-insert-performance)
- [PostgreSQL Explain](https://www.postgresguide.com/performance/explain/)

