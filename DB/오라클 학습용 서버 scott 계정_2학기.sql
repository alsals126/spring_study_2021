-- 서브쿼리
-- 2학기 내용
select * from emp;

-- 예제 1) 7566 사원보다 급여를 많이 받는 사원의 이름, 급여를 조회하라
-- 7577사원이 받는 급여
select sal
from emp
where empno=7566;

select ename, sal
from emp
where sal > 2975;

select ename, sal      --위에 두 문장을 한 문장으로 합침
from emp
where sal > (select sal
             from emp
             where empno=7566);


-- 예제2) emp 테이블에서 사원번호가 7521인 사원과 업무가 같고, 
-- 급여가 7934 사원번호를 가진 사원보다 많은 사원의 사원번호, 이름, 담당업무, 입사일자, 급여를 출력하라
-- 1. 'emp 테이블에서 사원번호가 7521인 사원의 업무(job)'를 출력하는 select문 작성
-- 2. 'emp 테이블에서 7934 사원번호를 가진 사원의 급여(sal)를 출력하는 select문 작성

select job
from emp
where empno=7521;

select job
from emp
where empno=7934;

-- 예제 2번 결과
select empno, ename, job, hiredate, sal
from emp
where job= (select job
            from emp
            where empno=7521)
      AND
      sal > (select sal
             from emp
             where empno=7934);

-- 예제3) emp테이블에서 급여를 제일 많이 받는 사원의 이름, 부서번호, 급여, 입사일자를 조회
-- emp테이블에서 급여의 최대값(MAX)
select MAX(sal) from emp; -- 최대값을 구하는 쿼리문

-- 예제 3번 정답
select empno, ename, job, hiredate, sal
from emp
where job= (select job
            from emp
            where empno=7521)
      AND
      sal > (select sal
             from emp
             where empno=7934);

-- 5000 대신에 서브쿼리를 작성
select empno, ename, deptno, sal, hiredate 
from emp
where sal = (select MAX(sal)
             from emp);
             
-- 예제4) emp테이블에서 급여의 평균보다 적은 사원의 사원번호, 이름, 담당업무, 급여, 부서번호를 출력하라
-- emp테이블에서 급여의 평균값을 구하는 서브쿼리를 작성한다.
select trunc(AVG(sal)) from emp;

-- 예제 4번 정답
select empno, ename, job, sal, deptno
from emp
where sal < (select trunc(AVG(sal))
             from emp);
             
-- 다중행 서브쿼리
-- 연산자
-- IN: 목록에 있는 임의의 값과 동일하면 참
-- ANY: 서브쿼리에서 반환된 각각의 값과 비교하여 하나라도 참이면 참
-- < ANY -->는 최대값보다 적음
-- > ANY -->는 최소값보다 큼
-- = ANY -->는 IN과 동일하다.
-- ALL: 서브쿼리에서 반환된 모든 값과 비교하여 모두 참이어야 한다
-- < ALL -->는 최소값보다 적음
-- > ALL -->는 최대값보다 큼

-- 예제1) 다음 문장의 결과를 확인하시오
select empno, ename, job, sal, deptno
from emp
where sal = (select MAX(sal)
             from emp
             GROUP BY deptno); -- 오류남
-- 위 문장에서 where절의 sal은 1개인데, 서브쿼리의 출력결과는 4개이다.

-- 해결방안
select empno, ename, job, sal, deptno
from emp
where sal IN (select MAX(sal)
              from emp
              GROUP BY deptno);
-- sal값이 부서별 최대값과 1개라도 일치하면 참이기 때문에
-- 출력해준다.
select empno, ename, job, sal, deptno
from emp
where sal IN (2850, 1100, 3000, 5000);
