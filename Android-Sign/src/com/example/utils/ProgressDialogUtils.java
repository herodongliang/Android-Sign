package com.example.utils;

import com.example.testmap.MainActivity;
import com.example.testmap.ToastUtil;
import com.zhy.http.okhttp.request.RequestCall;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
/**
 * ���ȶԻ���(ProgressDialog)������
 * @author lzh
 *
 */
public class ProgressDialogUtils {
	private static ProgressDialog dialog;
	/**
	 * ��ʾ���ȶԻ���
	 * @param flag01 �Ƿ����ͨ�����Back��ȡ���Ի��� 
	 * @param flag02 �Ƿ����ͨ�����Dialog��ȡ��Dialog������
	 * @param context �����Ĳ���
	 * @param title   �Ի���ı���
	 * @param message �Ի��������
	 * @param resId   �Ի����ͼ��
	 * @param canCelMessage �ֶ��رնԻ�����Ҫ��ʾ����Ϣ 
	 */
	public static void show(boolean flag01,boolean flag02,final Context context,String title,String message,int resId,final String canCelMessage){
		dialog = new ProgressDialog(context);
		// ���ý���������ʽΪԲ��ת���Ľ�����  
    	dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
    	// �����Ƿ����ͨ�����Back��ȡ�� (���Dialog���ȡ��Dialog������ )
    	dialog.setCancelable(flag01);
    	// �����ڵ��Dialog���Ƿ�ȡ��Dialog������ 
        dialog.setCanceledOnTouchOutside(flag02);
        // ������ʾ��title��ͼ�꣬Ĭ����û�еģ����û������title�Ļ�ֻ����Icon�ǲ�����ʾͼ���  
        dialog.setTitle(title);
        // ���ý��ȶԻ����ͼ��
        dialog.setIcon(resId);
        // ���ý��ȶԻ������������
        dialog.setMessage(message);
        //����ģ���ֶ�ȡ��
        dialog.setOnCancelListener(new OnCancelListener() {
			@Override
			public void onCancel(DialogInterface dialog) {
				// TODO Auto-generated method stub
				if(!"".equals(canCelMessage)){
					ToastUtil.show(context, canCelMessage);
					if(MainActivity.call!=null){
						MainActivity.call.cancel();
					}
				}
			}
		});
        // ��ʾ���ȶԻ���
        dialog.show();
	}
	/**
	 * �Ի����Ƿ�����ʾ״̬
	 * @return
	 */
	public static boolean isShowing(){
		if(dialog!=null&&dialog.isShowing()){
			return true;
		}
		return false;
	}
	/**
	 * �رս��ȶԻ���(cancel:�ᴥ����Ӧ�Ļص�����)
	 */
	public static void cancel(){
		if(dialog!=null&&dialog.isShowing()){
			//�رնԻ���
			dialog.cancel();
		}
	}
	/**
	 * �رս��ȶԻ���(dismiss:Ҳ�ᴥ����Ӧ�Ļص�����)
	 */
	public static void dismiss(){
		if(dialog!=null&&dialog.isShowing()){
			//�رնԻ���
			dialog.dismiss();
		}
	}
} 
