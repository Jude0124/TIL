# Git

> Git은 분산형버전관리시스템(DVCS) 중 
>
> 하나이다.

## 0. Git 기초 설정

* windows 환경에서는 `git for windows` 로 검색하여 `git bash` 를 설치한다. [다운로드 링크](https://gitforwindows.org/)

* 최초에 컴퓨터에서 git을 사용하는 경우 아래의 설정을 진행한다.

  ```bash
  $ git config --global user.email 이메일주소
  $ git config --global user.name 유저네임
  # 확인
  $ git config --global-l
  ```

  * 이메일주소를 설정할 때, github에 가입된 이메일로 설정을 해야 commit 이력이 github에 기록된다.

## 1. Git을 통한 버전관리 기본 흐름

### 1.1.Git 저장소 초기화

> 특정 폴더를 git 저장소로 활용하기 위해서 최초에 입력하는 명령어

```bash
$ git init
Initialized empty Git repository in C:/Users/Jude/Desktop/TIL/.git/
(master)  $
```

* .git 폴더가 숨긴 폴더로 생성되며, git bash에서는 (master) 라고 표기된다.
* 반드시 git으로 활용되고 있는 폴더 아래에서 저장소를 선언하지 말자.

### 1.2. add

> commit 대상 파일들을 추가한다.

add 전 상황

```bash
$ git status
On branch master

No commits yet
# 트랙킹 되지 않는 파일들
# => 새로 생성된 파일이고, git으로 관리 중이지 않는 파일
Untracked files:
	# git add 파일
	# commit 될 것들을 포함시키기 위해서 위의 명령어를 써라!
  (use "git add <file>..." to include in what will be committed)
        git.md
        markdown-images/
        markdown.md

nothing added to commit but untracked files present (use "git add" to track)

```

```bash
$ git add .
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   git.md
        new file:   "markdown-images/\353\213\244\354\232\264\353\241\234\353\223\234.jpg"
        new file:   "markdown-images/\354\235\264\353\257\270\354\247\200 \354\240\200\354\236\245.png"
        new file:   markdown.md
```

* add 명령어는 아래와 같이 활용된다.

```bash
$ git add . # 현재 디렉토리 전부
$ git add git.md # 특정 파일
$ git add markdown-images/ # 특정 디렉토리
```

### 1.3. commit

> 이력을 확정짓는 명령어

```bash
$ git commit -m '커밋메시지'
$ git commit -m 'Init'
[master (root-commit) 1b73d6e] Init
 4 files changed, 91 insertions(+)
 create mode 100644 git.md
 create mode 100644 "markdown-images/\353\213\244\354\232\264\353\241\234\353\223\234.jpg"
 create mode 100644 "markdown-images/\354\235\264\353\257\270\354\247\200 \354\240\200\354\236\245.png"
 create mode 100644 markdown.md

```

#### log 

> 커밋 내역들을 확인할 수 있는 명령어 

```bash
$ git log -1
# 최근 n 개 이력(1개)
$ git log -oneline
# 간략한 표현
$ git log --oneline -1
# 최근 n개 이력(1개) 간략하게
```

> 원격 저장소(remote repository)를 제공하는 서비스는 많다.(gitlab, bitbucket) 그 중에서 github을 기준으로 설명하겠다.

### 2.1. 원격 저장소 등록

> git아! 원격저장소(remote)로 등록해줘(add) origin 이라는 이름으로 URL을!

```bash
$ git remote add origin 저장소url
origin https://github.com/
```



* 저장소 확인

```bash
$ git remote -v
```

* 저장소 삭제

```bash
$ git remote rm origin
```

### 2.2 push





## git 활용 예시

### clone

> 원격 저장소를 복제해온다.

```bash
~/집 (master) $ git clone https://github.com/edutak/TIL--nlp.git
```

* 복제 하는 경우 원격저장소 이름의 폴더가 생성된다.
* 해당 폴더로 이동하여 활용을 하면 된다.
* 이후 작업을 하는 경우 add, commit, push

### pull

> 원격 저장소의 변경사항을 받아온다.

```bash
$ git pull origin master
```



## 주의사항

> 원격 저장소와 로컬 저장소의 이력이 다르게 구성되는 경우
>
> 1) Github에서 직접 파일 수정을 하거나,
>
> 2) 협업하는 과정이거나,
>
> 3) 집-강의장 환경으로 왔다갔다 하는 상황등에서 발생할 수 있는 오류

* 해결방법은 다음과 같다.
  * 원격 저장소 내용을 받아온다.
* 이때 Vim 편집기 화면이 뜨는데, 커밋 메세지를 작성할 수 있는 곳이다.
  * esc를 누르고 , :wq를  순서대로 입력한다.
* 다시 push를 한다.

# 기타

1. 강사님 메일주소

   tak@hphk.kr

2. 객체지향이란?

   S + V 

3. 강의 추천

   * edwith.org

     조경현 교수님 강의

   * 에듀캐스트

     모두를 위한 딥러닝

     김성훈교수님

4. 폰트 추천 

   * D2Coding