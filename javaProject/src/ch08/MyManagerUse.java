package ch08;

public class MyManagerUse {
	
	public static void main(String[] args) {
		
		MyManager mgrobj = MyManager.getIstance();
		System.out.println("grobj.getScore() : " + mgrobj.getScore());
		mgrobj.setScore(100);
		System.out.println("mgrobj.getScore() : " + mgrobj.getScore());
		MyManager newMgr = MyManager.getIstance();
		System.out.println("mgrobj.getScore() : " + newMgr.getScore());
	}

}
