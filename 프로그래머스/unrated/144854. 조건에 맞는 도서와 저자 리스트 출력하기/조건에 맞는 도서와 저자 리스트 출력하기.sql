-- 코드를 입력하세요
SELECT a.book_id,b.author_name,date_format(a.PUBLISHED_DATE,"%Y-%m-%d")
from book a join author b on
a.author_id = b.author_id
where a.category = '경제'
order by PUBLISHED_DATE 