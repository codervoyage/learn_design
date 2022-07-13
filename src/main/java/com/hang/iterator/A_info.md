Aggregate 表示集合的接口

Iterator 遍历集合的接口 

Book 表示书的类

BookShelf 表示书架的类

BookShelfIterator 遍历书架的类


##########
印在脑海中：尽量不用具体的类来编程，要优先使用抽象类和接口编程。
#############

Aggregate抽象集合 _create_> Iterator 抽象遍历的行为

BookShelf impl Aggregate  具体的集合->书架
BookShelfIterator impl Iterator  具体的迭代器->专门遍历书架的书架迭代器

BookShelf create创建 BookShelfIterator
BookShelfIterator 聚合 BookShelf 
