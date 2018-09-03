package com.epam;
import java.lang.String;
import java.util.*;

public class Elections {
    public void Election(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Count : ");
        int n=scanner.nextInt();
        scanner.nextLine();
        String[] votes=new String[n];
        System.out.println("Enter Votes: ");
        for(int i=0;i<n;i++){
            votes[i]= scanner.nextLine();
        }
//        ArrayList<String> unique= new ArrayList<>();
//        for(int i=0;i<n;i++){
//            if(!unique.contains(votes[i].trim())){
//                unique.add(votes[i].trim());
//            }
//        }
        ArrayList<String> list=new ArrayList<>(Arrays.asList(votes));
        Collections.sort(list);
        Set<String> unique = new HashSet<>(list);
        ArrayList<Integer> count=new ArrayList<>();
        int k=0;
        for (String key : list) {
            count.add(Collections.frequency(list, key));
        }
        System.out.println(Collections.max(count));


    }
}
