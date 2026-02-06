public class QuetionService {
    Quetion[] quetions=new Quetion[5];

    public QuetionService(){
        quetions[0]=new Quetion(1,"what1","java","CPP","python","javascript","java");
        quetions[1]=new Quetion(1,"what2","java","CPP","python","javascript","java");
        quetions[2]=new Quetion(1,"what3","java","CPP","python","javascript","java");
        quetions[3]=new Quetion(1,"what4","java","CPP","python","javascript","java");
        quetions[4]=new Quetion(1,"what5","java","CPP","python","javascript","java");
    }

    public void displayQuetions(){
        
        for(Quetion q:quetions){
            System.out.println(q);
        }
    }
}
