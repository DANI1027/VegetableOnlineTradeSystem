### 基于B/S的生鲜蔬菜销售系统
---

* 需求分析:
	* 买家：
		* 浏览商品界面，选择喜欢的商品
		* 提交订单
		* 确认收货
		* 购物车
		* 对已购买的商品进行评价
		* 退货（提供图片接口）
	* 卖家：
		* 添加商品（提供图片接口）
		* 确认订单
		* 确认物流信息状态
		* 统计商品销售信息界面
		* 查看每个商品的销售信息

	* 数据库设计
		* 用户信息表（userId(key), username, password, number, isAdmin）
		* 蔬菜信息表（vegetableId(key)，vegetableName，vegetablePicture, vegetableDescription, vegetableChenben，vegetableCost，vegetableCount）
		* 购物车信息表(userId, List<Vegetables>)
		* 评价信息表（commentId(key), userId, vegetableId, commentContent, commentPicture）
		* 订单信息表（orderId(key), userId, List<Vegetables>, totalCount, status）
		* 销售信息统计表（vegetableId(key), count, totalCount, data）

* 接口 API：
	* 注册接口
		* URL：@RequestMapping(method = RequestMethod.POST, value = "/register")
		* 参数：{"username":"test","password":"123456","mobilePhoneNumber":"13552646897"}
		* 返回值：{"result":true,"reason":"注册成功"}
	* 登录接口
		* URL：@RequestMapping(method = RequestMethod.POST, value = "/login")
		* 参数：
			* {"password":"123456","mobilePhoneNumber":"13552646897"}
			* {"username":"test","password":"123456"}
		* 返回值：{"result":true,"reason":"登录成功"}

		