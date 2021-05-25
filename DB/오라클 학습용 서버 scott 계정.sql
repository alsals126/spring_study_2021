-- ROLLUP
SELECT deptno, job, SUM(sal)
FROM emp
GROUP BY ROLLUP(deptno, job);
-- 부서별 합계
-- 전체 합계

SELECT deptno, job, SUM(sal)
FROM emp
GROUP BY ROLLUP((deptno, job));
-- 전체 급여 합계만 출력