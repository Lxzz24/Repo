# 第2章 有意义的命名  
---  
  
# 2.1 介绍  
软件中随处可见命名。我们给变量、函数、参数、类和包命名。    
我们给源代码及源代码所在目录命名。    
这么多命名要做，不妨做好它。    
下文列出了取个好名字的几条简单规则。    
# 2.2 名副其实,见名知意  
变量名太随意，haha、list1、ok、theList 这些都没啥意义    
# 2.3 避免误导    
包含List、import、java等类名、关键字或特殊字；    
字母o与数字0，字母l与数字1等    
提防使用不同之处较小的名称。    
比如：	XYZControllerForEfficientHandlingOfStrings    
		与XYZControllerForEfficientStorageOfStrings    
# 2.4 做有意义的区分  
反面教材，变量名：a1、a2、a3    
避免冗余，不要出现Variable、表字段中避免出现table、字符串  
避免出现nameString，直接name就行，知道是字符串类型  
再比如：  
	定义了两个类：Customer类和CustomerObject类，如何区分？  
		定义了三个方法：getActiveAccount()、getActiveAccounts()、  
						getActiveAccountInfo()，如何区分？  
# 2.5 使用读得出来的名称
不要使用自己拼凑出来的单词，比如：  
xsxm(学生姓名)；  
genymdhms(生成日期，年、月、日、时、分、秒)  
所谓的驼峰命名法，尽量使用完整的单词  
# 2.6 使用可搜索的名称  
一些常量，最好不直接使用数字，而指定一个变量名，这个变量名可以便于搜索到.    
比如：找MAX_CLASSES_PER_STUDENT很容易，但想找数字7就麻烦了。    
# 2.7 避免使用编码  
## 2.7.1 匈牙利语标记法    
即变量名表明该变量数据类型的小写字母开始。      
例如，szCmdLine的前缀sz表示“以零结束的字符串”。      
## 2.7.2 成员前缀      
避免使用前缀，但是Android中一个比较好的喜欢用m表示私有等，个人感觉比较好      
## 2.7.3 接口和实现      
作者不喜欢把接口使用I来开头，实现也希望只是在后面添加Imp        
      
          