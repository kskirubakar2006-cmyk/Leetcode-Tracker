-- Last updated: 09/07/2026, 15:08:39
select score, dense_rank()  over(order by score desc) as "rank" from Scores;