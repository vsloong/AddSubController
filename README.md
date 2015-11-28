# 说明

---

类似购物车的一种数量加减的控制器，具体见效果图：

![](https://github.com/HandsomeDragon-Wu/AddSubtractController/raw/master/pictures/demo1.png)
![](https://github.com/HandsomeDragon-Wu/AddSubtractController/raw/master/pictures/demo2.png)
![](https://github.com/HandsomeDragon-Wu/AddSubtractController/raw/master/pictures/demo3.png)

主要使用两个Button和一个TextView来实现效果，
按钮背景依靠layer-list和shap的属性来绘制圆角矩形，
具体代码见drawable文件夹：

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_centerInParent="true"
        android:gravity="center"
        android:orientation="horizontal">

        <Button
            android:id="@+id/btn_subtract"
            android:layout_width="50dp"
            android:layout_height="match_parent"
            android:background="@drawable/selecter_left"
            android:gravity="center"
            android:text="-"
            android:textColor="@android:color/white"
            android:textSize="32sp" />

        <TextView
            android:id="@+id/text_number"
            android:layout_width="100dp"
            android:layout_height="match_parent"
            android:background="#F1F1F1"
            android:gravity="center"
            android:text=""
            android:textSize="20sp"/>

        <Button
            android:id="@+id/btn_add"
            android:layout_width="50dp"
            android:layout_height="match_parent"
            android:background="@drawable/selecter_right"
            android:text="+"
            android:textColor="@android:color/white"
            android:textSize="20sp" />
    </LinearLayout>



 
 
 
