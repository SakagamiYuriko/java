/*************************************************************************
*[概要]java基礎Qus1_13
*[詳細]Q1.ローカル変数の宣言Q2.ローカル変数の初期化Q3.ローカル変数の値の代入
Q4.ローカル変数の出力Q5.ローカル変数の正誤問題Q6.ローカル変数を使った自己紹介文
Q7.ローカル変数を使ったBMI計算Q8.ローカル変数の再代入Q9.ローカル変数の和算
Q10.ローカル変数のtrue式Q11.文字列型への変換Q12.整数型への変換Q13.true出力式
**************************************************************************/

package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
/*************************************************************************
[概要]Q1.ローカル変数の宣言
**************************************************************************/
//		下記9個をローカル変数として宣言のみしてください
//		・バイト型・短整数型・整数型・長整数型
		byte b;
		short s;
		int i;
		long l;
//		・単精度浮動小数点数型・倍精度浮動小数点数型
		float f;
		double d;
//		・文字型・文字列型
		char c;
		String Str;
//		・ブーリアン型
		boolean bool;

/*************************************************************************
[概要]Q2.ローカル変数の初期化
**************************************************************************/
//		それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください
		
//		・バイト型・短整数型・整数型・長整数型
		b=0;
		s=0;
		i=0;
	    l=0L;
//		・単精度浮動小数点数型・倍精度浮動小数点数型
		f=0.0f;
		d=0.0d;
//		・文字型・文字列型
	    c='\u0000';
		Str=null;
//		・ブーリアン型
		bool=false;
		
/*************************************************************************
 [概要]Q3.ローカル変数の値の代入
**************************************************************************/
//		初期化をしたそれぞれの変数に下記の値を代入してください
//		・バイト型 10
	    b=10;
//		・短整数型 100
		s=100;
//		・整数型 1000
		i=1000;
//		・長整数型 10000
		l=10000;
//		・単精度浮動小数点数型 9.5
	    f=9.5f;
//		・倍精度浮動小数点数型 10.5
		d=10.5;
//		・文字型 a
	    c='a';
//		・文字列型 ハロー
		Str="ハロー";
//		・ブーリアン型　true
	    bool=true;

/*************************************************************************
[概要]Q4.ローカル変数の出力
**************************************************************************/
//		下記の通りにコンソール出力されるようにしてください			
//		上記で作成した変数を必ず使用すること			
//		11110
		System.out.println(l+i+s+b);
//		20
		System.out.println(String.format("%.1f", b*2.0));
//		a ハロー true
		System.out.println(c+Str+bool);
//		11130
//		10000000000	
//		0.105
//		-90	

		
	
	}

}


/*************************************************************************

**************************************************************************/
