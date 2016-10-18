﻿# CIMS
This is a Contract Implementation Management System.

  ##前端开发规范：
  
  1.自己只能修改自己负责模块的文件，禁止修改公共文件。
  
  2.页面统一放在jsp文件夹内，每个模块建一个文件夹，每个模块只允许有一个index.jsp文件作为入口文件。
  
  3.每个模块可以自行定义一个CSS文件放在css文件夹中，图片统一放在images文件夹中。
  
  4.js文件规范：引用外部库放在js/lib文件夹中，自己写的js文件放在js/app文件夹中。系统中每个模块对应一个主js文件。
  
  5.写注释写注释写注释

  ##后台开发规范：
  
  1.所有新建的类都要有注释，格式如下：
    <pre>
    /**
    * 该类的功能
    * @author 创建人
    * @date 2016年9月8日
    */
   </pre> 
  2.所有的接口、方法带注释，说明功能。
  
  3.在别人维护的类中新增方法，必须注明操作人。
  
  4.如果在实体类中修改字段，说明情况，统一修改，并做好修改记录。
