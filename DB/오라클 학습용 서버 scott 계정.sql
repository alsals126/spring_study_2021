-- ROLLUP
SELECT deptno, job, SUM(sal)
FROM emp
GROUP BY ROLLUP(deptno, job);
-- �μ��� �հ�
-- ��ü �հ�

SELECT deptno, job, SUM(sal)
FROM emp
GROUP BY ROLLUP((deptno, job));
-- ��ü �޿� �հ踸 ���