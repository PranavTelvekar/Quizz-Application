import java.util.Scanner;
public class QuetionService {
    Quetion[] quetions=new Quetion[5];
    String[] selection=new String[5];
    public QuetionService(){
        quetions[0]=new Quetion(1,"what1","java","CPP","python","javascript","java");
        quetions[1]=new Quetion(2,"what2","java","CPP","python","javascript","java");
        quetions[2]=new Quetion(3,"what3","java","CPP","python","javascript","java");
        quetions[3]=new Quetion(4,"what4","java","CPP","python","javascript","java");
        quetions[4]=new Quetion(5,"what5","java","CPP","python","javascript","java");
    }

    public void playQuizz(){
        int i=0;
        for(Quetion q:quetions){
            System.out.println("Quetion no: "+q.getId());
            System.out.println(q.getQuetion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc=new Scanner(System.in);
            selection[i++]=sc.nextLine();

        }

        for(String s:selection){
            System.out.println(s);
        }
    }

    public void printScore(){
        int score=0;
        for(int i=0;i<quetions.length;i++){
            Quetion que=quetions[i];
            String actualAnswer=que.getAnswer();
            String userAnswer=selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }


        }

        System.out.println("Your Score Is : "+score);
    }
}
