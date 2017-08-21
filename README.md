Mapside-Join
============
This code is use to do join task of two tables on Hadoop map reduce framework.

For details: http://unmeshasreeveni.blogspot.in/2014/12/joining-two-files-using-multipleinput.html

============
Jing He
8/21/2017

My revision optimize the value order of two tables in reduce result, since in the old version, you cannot make sure the value of which table will show in the first place. For example:

If we have two tables
Table 1
1	Mike
2	Jack
3	Karen

Table 2
1	97
2	94
3	87

In the old Version, the join result used to be like:
1	Mike,97
2	94,Jack
3	87,Karen

In my version, the order of the values from two tables is sorted:
1	Mike,97
2	Jack,94
3	Karen,87