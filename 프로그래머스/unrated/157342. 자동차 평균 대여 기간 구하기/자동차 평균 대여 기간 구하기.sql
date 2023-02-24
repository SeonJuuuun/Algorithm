-- 코드를 입력하세요
SELECT car_id, round(avg(datediff(END_DATE, START_DATE) + 1),1) as AVERAGE_DURATION
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
# where avg(datediff(END_DATE, START_DATE) + 1) >= 7 
group by CAR_ID
having avg(datediff(END_DATE, START_DATE) + 1) >= 7 
order by AVERAGE_DURATION desc, CAR_ID desc