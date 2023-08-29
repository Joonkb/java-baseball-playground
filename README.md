## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

## 숫자야구게임 구현하기

---
#### 게임흐름 

1. 컴퓨터의 숫자를 입력받는다. (3개의 숫자)
2. 숫자를 제시한다. (3개의 숫자)
3. 컴퓨터의 숫자와 제시된 숫자를 비교하여 결과값을 도출한다.

#### 기능목록

1. UI로직 구현하기
   1. InputView
   2. ResultView
2. 게임 클래스를 구현한다. (GameEngine)
   1. 컴퓨터의 랜덤한 숫자를 생성한다.
   2. 컴퓨터의 랜덤한 숫자와 사용자로부터 입력받은 숫자를 비교하여 GameResult를 반환한다.
3. 게임이 동작하는? 클래스를 구현한다. BaseballGame

#### 고민

InputView와 ResultView 에서

- 문자열을 반환하도록 구성할 것인지 혹은 해당 클래스에서 문자열을 출력할 것인지?
- 

