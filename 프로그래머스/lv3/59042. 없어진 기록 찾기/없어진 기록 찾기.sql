-- 코드를 입력하세요
SELECT B.ANIMAL_ID,B.NAME
from ANIMAL_OUTS B 
left outer join ANIMAL_INS A on B.ANIMAL_ID = A.ANIMAL_ID
where A.ANIMAL_ID is null
order by B.ANIMAL_ID asc

