-- ��������
-- 2�б� ����
select * from emp;

-- ���� 1) 7566 ������� �޿��� ���� �޴� ����� �̸�, �޿��� ��ȸ�϶�
-- 7577����� �޴� �޿�
select sal
from emp
where empno=7566;

select ename, sal
from emp
where sal > 2975;

select ename, sal      --���� �� ������ �� �������� ��ħ
from emp
where sal > (select sal
             from emp
             where empno=7566);


-- ����2) emp ���̺��� �����ȣ�� 7521�� ����� ������ ����, 
-- �޿��� 7934 �����ȣ�� ���� ������� ���� ����� �����ȣ, �̸�, ������, �Ի�����, �޿��� ����϶�
-- 1. 'emp ���̺��� �����ȣ�� 7521�� ����� ����(job)'�� ����ϴ� select�� �ۼ�
-- 2. 'emp ���̺��� 7934 �����ȣ�� ���� ����� �޿�(sal)�� ����ϴ� select�� �ۼ�

select job
from emp
where empno=7521;

select job
from emp
where empno=7934;

-- ���� 2�� ���
select empno, ename, job, hiredate, sal
from emp
where job= (select job
            from emp
            where empno=7521)
      AND
      sal > (select sal
             from emp
             where empno=7934);

-- ����3) emp���̺��� �޿��� ���� ���� �޴� ����� �̸�, �μ���ȣ, �޿�, �Ի����ڸ� ��ȸ
-- emp���̺��� �޿��� �ִ밪(MAX)
select MAX(sal) from emp; -- �ִ밪�� ���ϴ� ������

-- ���� 3�� ����
select empno, ename, job, hiredate, sal
from emp
where job= (select job
            from emp
            where empno=7521)
      AND
      sal > (select sal
             from emp
             where empno=7934);

-- 5000 ��ſ� ���������� �ۼ�
select empno, ename, deptno, sal, hiredate 
from emp
where sal = (select MAX(sal)
             from emp);
             
-- ����4) emp���̺��� �޿��� ��պ��� ���� ����� �����ȣ, �̸�, ������, �޿�, �μ���ȣ�� ����϶�
-- emp���̺��� �޿��� ��հ��� ���ϴ� ���������� �ۼ��Ѵ�.
select trunc(AVG(sal)) from emp;

-- ���� 4�� ����
select empno, ename, job, sal, deptno
from emp
where sal < (select trunc(AVG(sal))
             from emp);
             
-- ������ ��������
-- ������
-- IN: ��Ͽ� �ִ� ������ ���� �����ϸ� ��
-- ANY: ������������ ��ȯ�� ������ ���� ���Ͽ� �ϳ��� ���̸� ��
-- < ANY -->�� �ִ밪���� ����
-- > ANY -->�� �ּҰ����� ŭ
-- = ANY -->�� IN�� �����ϴ�.
-- ALL: ������������ ��ȯ�� ��� ���� ���Ͽ� ��� ���̾�� �Ѵ�
-- < ALL -->�� �ּҰ����� ����
-- > ALL -->�� �ִ밪���� ŭ

-- ����1) ���� ������ ����� Ȯ���Ͻÿ�
select empno, ename, job, sal, deptno
from emp
where sal = (select MAX(sal)
             from emp
             GROUP BY deptno); -- ������
-- �� ���忡�� where���� sal�� 1���ε�, ���������� ��°���� 4���̴�.

-- �ذ���
select empno, ename, job, sal, deptno
from emp
where sal IN (select MAX(sal)
              from emp
              GROUP BY deptno);
-- sal���� �μ��� �ִ밪�� 1���� ��ġ�ϸ� ���̱� ������
-- ������ش�.
select empno, ename, job, sal, deptno
from emp
where sal IN (2850, 1100, 3000, 5000);
