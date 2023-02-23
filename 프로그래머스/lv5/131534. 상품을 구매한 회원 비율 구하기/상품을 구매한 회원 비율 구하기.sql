-- 코드를 입력하세요
SELECT date_format(b.SALES_DATE, '%Y') YEAR , date_format(b.sales_date, '%m') MONTH,
COUNT(DISTINCT b.user_id) PUCHASED_USERS,

round(COUNT(DISTINCT b.user_id) 
             / (SELECT COUNT(user_id)
                FROM user_info
                WHERE DATE_FORMAT(joined, '%Y') = '2021'), 1) PUCHASED_RATIO







from USER_INFO A join ONLINE_SALE b
on a.USER_ID = b.USER_ID
where year(a.joined) = 2021
group by YEAR,MONTH
order by year(joined) asc , month(joined)





