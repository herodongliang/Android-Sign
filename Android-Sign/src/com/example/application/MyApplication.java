package com.example.application;


import java.util.concurrent.TimeUnit;

import com.zhy.http.okhttp.OkHttpUtils;

import android.app.Application;
import okhttp3.OkHttpClient;

public class MyApplication extends Application{
	
	/**
	 * androidӦ�ó���������ڡ�
     * �˷���������activity��servie��receiver���֮ǰ����
	 */
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		OkHttpClient okHttpClient = new OkHttpClient.Builder()
//              .addInterceptor(new LoggerInterceptor("TAG"))
                .connectTimeout(10000L, TimeUnit.MILLISECONDS)
                .readTimeout(10000L, TimeUnit.MILLISECONDS)
                //��������
               .build();

      OkHttpUtils.initClient(okHttpClient);
	}
}
