package com.example.demo.tv;/*class SmartTv extends TvControl{ <= "TvControl" class included, plus the following lines. 상속
    int number; //etcetc
}
*/
/*class SmartTv extends Object{  //상속.
    int number;
}
*/

class TvControl {
//class TvControl extends {}    tH i'd know what this is for

    public static void main(String[] args) {

        //Tv.password = 1234;

        Tv lgTv = new Tv("LG");
        Tv sTv = new Tv("Samsung");
        Tv hTv = new Tv("HP", 2048); //overloading eg

        System.out.println(lgTv.toString()); //상속받은 개체 클래스?
        //hTv.sound();

        System.out.println(hTv.getCurrent_channel());
        //hTv.current_channel = 11111111;
        hTv.setCurrent_channel(7); //set to #. ->L105
        System.out.println(hTv.getCurrent_channel());
        System.out.println(hTv.resolution);

        /*
        int[] arr = hTv.getChannel(); //L101? arr=채널대역대시작값
        for(int i=0; i < arr.length; i++){ //방의 전체길이. i=0 처음한번만 실행. arr.length=100. 하고 반복.
            System.out.println(arr[i]);
            //Thread.sleep(500); //채널별로 스캔되면서 다음으로 넘어가는
        } //can be made into "TvScan" class

         */


    }
    public static class Speaker{
        int dolby;
        public String sound(){
            return "dolby sound";
        }
    }

    public static class Tv {
        //속성
        String model_name; //초기화?
        int[] channel; //range; 참조변수, int형 배열
        int current_channel; //외부직접접근 방지로 private
        int resolution;
        boolean power; //L59 같은거

        static int password; //static선언시 자동으로 위에 연결됨. 없으면 실행불가.
        static void display(){
            System.out.println("화면전시");
        }

        Tv(String tv_name){ //초기화
            model_name = tv_name;
            resolution = 1024;
            power = false;
            current_channel = 0;
            channel = new int[100]; //총 채널 갯수 설정; 현재 총 400바이트 메모리 설정
            for(int i = 0; i < channel.length; i++){
                channel[i] = i + 1;

            }

        }

        Tv(String tv_name, int resolution){ //L109 overloading eg
            model_name = tv_name;
            this.resolution = resolution; //Tv자신의 resolution을 가리킴
            power = false;
            current_channel = 0;
            channel = new int[100];
            for(int i = 0; i < channel.length; i++){
                channel[i] = i + 1;

            }

        }
        public Tv getTv(){
            return this;

        }

        //Getter Setter

        public int[] getChannel() { //L46 참조변수. 주소값을 get부르는.
            return channel;
        }

        public void setChannel(int[] channel) { //L46. 주소값을 set하는.
            this.channel = channel;
        }

        public int getCurrent_channel() {  //바로 보여지는 채널
            return current_channel; //채널대역대?설정
        }

        public void setCurrent_channel(int current_channel) { //바로 보여지는 채널
            if(current_channel > 100){ //조건식
                System.out.println("입력오류 : 없는 채널입니다.");
            } else{ //위 조건식 적용 예외
                this.current_channel = current_channel; //현재채널번호 저장or보임
            }

        }

        //기능
        /*
       @Override
            public String sound() {
            return "Tv dolby sound"; //L34 speaker class 오버라이드
        } L62 충돌
        */ 
        @Override
        public String toString() {
            //System.out.println("오버라이딩 메소드"); <=only when public void toString().
            return "오버라이딩 메소드";
            //return super.toString();
        }
    }

    }



