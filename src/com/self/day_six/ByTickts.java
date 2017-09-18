package com.self.day_six;

public class ByTickts{
      private int money5=3,money10=0,money20=0;
      
      public synchronized void byTickts(int money){
    	  if(money==20){
    		  while(money5<3||(money5<1&&money10<1)){
    			  try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		  }
    		  if(money10>=1&&money5<3){
				System.out.printf("你给我%d,我补你%d(1张10元，1张5元)%n",money,(money-5));
				money20++;
				money10--;
				money5--;
				}
    		  if(money10<1&&money5>=3){
  				System.out.printf("你给我%d,我补你%d(3张5元)%n",money,(money-5));
  				money20++;
  				money5-=3;
  				}
    	  }else if (money==10) {
			while(money5<1){
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.printf("你给我%d,我补你%d%n",money,(money-5));
			money5--;
		}else if (money==5) {
			System.out.printf("你给我%d,刚好能买一张票%n",money);
			money5++;
		}
      }

}
