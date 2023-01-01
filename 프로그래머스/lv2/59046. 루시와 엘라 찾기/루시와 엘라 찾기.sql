# SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
# FROM ANIMAL_INS
# WHERE NAME IN ('Lucy','Ella','Pickle','Rogan','Mitty')
# ORDER BY ANIMAL_ID;
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE 
from ANIMAL_INS 
where NAME in ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty') 
order by ANIMAL_ID;