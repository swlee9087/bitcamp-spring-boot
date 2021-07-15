package com.example.demo.dog.controller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import com.example.demo.dog.service.DogServiceImpl;
import com.example.demo.util.service.LambdaUtils;
import java.util.List;
import java.util.Scanner;
//@Controller
//@NoArgsConstructor//덕분에 생성자를 안써도 ref로 연결됨.
public class DogController extends LambdaUtils {

    private  DogService dogService;

    public DogController(){
        dogService=new DogServiceImpl();
    }

    public void main(){
        Scanner scanner=new Scanner(System.in);
        while(true){
            print.accept("\n[menu] 0=end | 1=add | 2=count | 3=list");
            print.accept("\nEnter : ");
            switch (scanner.next()){
                case"0": return;
                case"1": DogDTO dog = new DogDTO(); //Element class should be inside "while"
                    dog=new DogDTO();
                    print.accept("\nname : ");
                    dog.setName(scanner.next()); //Dog class에 저장. --> obj 본다/지향한다.
                    print.accept("color : ");
                    dog.setColor(scanner.next());//
                    print.accept("breed : ");
                    dog.setBreed(scanner.next());
                    dogService.add(dog);break;
                case"2":
                    print.accept("\nNumber of dogs registered : " + string.apply(dogService.count())+"\n");
                    break;
                case"3": List<DogDTO> list=(List<DogDTO>)dogService.show();
                for(DogDTO d: list){
                    print.accept(d.toString()+"\n");
                }
                    break;
            }
        }
    }

    public void add(DogDTO dog){
        dogService.add(dog);
    }
    public int count(){return dogService.count();}

    public void show(){
        print.accept("\nNumber of dogs registered : " + string.apply(dogService.count())+"\n");

    }

    public String barking(String bark) {
        return dogService.barking(bark);
    }


    public String fetching(String target) {
        return dogService.fetching(target);
    }


    public String waggingTail() {
        return dogService.waggingTail();
    }
}
