package testsX;

public class TestPtintService implements java.awt.print.Printable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.awt.print.PrinterJob pj=java.awt.print.PrinterJob.getPrinterJob();
		pj.setPrintable(new TestPtintService());
		try{
			pj.print();
		}catch(Exception e){
			
		}
	}
	public int print(java.awt.Graphics g,java.awt.print.PageFormat pf,int page) throws java.awt.print.PrinterException{


		if(page==0){
			g.drawString("abcdefg", 100, 100);
			return java.awt.print.Printable.PAGE_EXISTS;
		}else{
			return java.awt.print.Printable.NO_SUCH_PAGE;
		}

	}
}
