import java.util.*;

public class CombinaTeste {

    String[] status = new String[] { "01", "02", "03", "04","05"};
//----------------------------------------------------------------------------------------------------------------------
    public void comparations1(){
        List<SortedSet<Comparable>> allCombList = new ArrayList<SortedSet<Comparable>>(); //aqui vai ficar a resposta
//----------------------------------------------------------------------------------------------------------------------
        for (String nstatus : status) {
            allCombList.add(new TreeSet<Comparable>(Arrays.asList(nstatus))); //insiro a combinação "1 a 1" de cada item
        }
//----------------------------------------------------------------------------------------------------------------------
        for (int nivel = 1; nivel < status.length; nivel++) {

            List<SortedSet<Comparable>> statusAntes = new ArrayList<SortedSet<Comparable>>(allCombList); //crio uma cópia para poder não iterar sobre o que já foi

            for (Set<Comparable> antes : statusAntes) {
                SortedSet<Comparable> novo = new TreeSet<Comparable>(antes); //para manter ordenado os objetos dentro do set
                novo.add(status[nivel]);
                if (!allCombList.contains(novo)) { //testo para ver se não está repetido
                    allCombList.add(novo);
                }
            }
        }
//----------------------------------------------------------------------------------------------------------------------
        Collections.sort(allCombList, new Comparator<SortedSet<Comparable>>() { //aqui só para organizar a saída de modo "bonitinho"

            @Override
            public int compare(SortedSet<Comparable> n1, SortedSet<Comparable> n2) {
                int sizeComp = n1.size() - n2.size();
                if (sizeComp == 0) {
                    Iterator<Comparable> o1iIterator = n1.iterator();
                    Iterator<Comparable> o2iIterator = n2.iterator();
                    while (sizeComp == 0 && o1iIterator.hasNext() ) {
                        sizeComp = o1iIterator.next().compareTo(o2iIterator.next());
                    }
                }
                return sizeComp;

            }
        });
//----------------------------------------------------------------------------------------------------------------------
        System.out.println(allCombList);
    }
//FIM DO METODO
//----------------------------------------------------------------------------------------------------------------------
    public void comparations2(){

        SortedSet<SortedSet<Comparable>> allCombList = new TreeSet<SortedSet<Comparable>>(new Comparator<SortedSet<Comparable>>() {

            @Override
            public int compare(SortedSet<Comparable> o1, SortedSet<Comparable> o2) {

                int sizeComp = o1.size() - o2.size();

                if (sizeComp == 0) {
                    Iterator<Comparable> o1iIterator = o1.iterator();
                    Iterator<Comparable> o2iIterator = o2.iterator();

                    while (sizeComp == 0 && o1iIterator.hasNext() ) {
                        sizeComp = o1iIterator.next().compareTo(o2iIterator.next());
                    }
                }

                return sizeComp;

            }
        });
//----------------------------------------------------------------------------------------------------------------------
        for (String nstatus : status) {
            allCombList.add(new TreeSet<Comparable>(Arrays.asList(nstatus)));
        }
//----------------------------------------------------------------------------------------------------------------------
        for (int nivel = 1; nivel < status.length; nivel++) {
            List<SortedSet<Comparable>> statusAntes = new ArrayList<SortedSet<Comparable>>(allCombList);

            for (Set<Comparable> antes : statusAntes) {
                SortedSet<Comparable> novo = new TreeSet<Comparable>(antes);
                novo.add(status[nivel]);
                allCombList.add(novo);
            }
        }
//----------------------------------------------------------------------------------------------------------------------
        System.out.println(allCombList);
    }
//----------------------------------------------------------------------------------------------------------------------
}
