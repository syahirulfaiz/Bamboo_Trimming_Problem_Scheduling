# Bamboo_Trimming_Problem_Scheduling

This programming puzzle, Bamboo Trimming Problem, originated from a research paper ‘Bamboo Garden Trimming (BGT) Problem (Perpetual maintenance of machines with different attendance urgency factors)’ by Prof Leszek Gąsieniec et. al[1]. 

The paper discussed how to design a perpetual schedule of cuts to maintain the tallest bamboo height as low as possible. This COMP526 assignment specifically categorised as discrete BGT. The constraint of this discrete problem is we can only trim one bamboo for each day, and the actual trimming is instantaneous (cut to the root so that the height becomes zero).

We have not enough time to finish studying the paper cited in the Reference section. Therefore, our design is probably not optimised enough. After we read and studied the reference, we decided to use Reduce-Max approach [1], which is similar a greedy priority scheduling wherein each day we cut the tallest bamboo, regardless of the growth rates distribution, 

and the maximum quotient of $$\frac{maxHeight}{sumOfGrowthRates}$$ becomes the ‘ratio’ we report based on our designed schedule list C.

# References #

[1]	Gąsieniec, L.; Klasing, R.; Levcopoulos, C.; Lingas, A.; Min, J.; Radzik, T. Bamboo Garden Trimming Problem (Perpetual Maintenance of Machines with Different Attendance Urgency Factors). In SOFSEM 2017: Theory and Practice of Computer Science, Proceedings of the 43rd International Conference on Current Trends in Theory and Practice of Computer Science, Limerick, Ireland, 16–20 January 2017; Lecture Notes in Computer Science; Springer: Berlin, Germany, 2017; Volume 10139, pp. 229–240
