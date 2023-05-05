package org.ahocorasick;

import org.ahocorasick.keyword.RegionalKeyword;
import org.ahocorasick.trie.PayloadEmit;
import org.ahocorasick.trie.PayloadTrie;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main{

    public static void main(String[] args) {

        Main main = new Main();

        main.parallelApproach();

        main.parallelApproach();

        main.parallelApproach();

        main.parallelApproach();

        main.parallelApproach();

        main.parallelApproach();

    }


    public void parallelApproach(){
        List<RegionalKeyword> regionalKeywords = new ArrayList<>();
        CsvToEntity csvToEntity = new CsvToEntity(regionalKeywords);

        csvToEntity.fillRegionalKeywords("C:\\Users\\omar.mahamid\\Documents\\GitHub\\aho-corasick\\src\\main\\resources\\RegionalKeyword.csv");

        PayloadTrie.PayloadTrieBuilder<String> builder1;
        PayloadTrie.PayloadTrieBuilder<String> builder2;
        ExecutorService service = Executors.newFixedThreadPool(4);

        builder1 = PayloadTrie.<String>builder().ignoreCase();
        builder2 = PayloadTrie.<String>builder().ignoreCase();

        int size = csvToEntity.getRegionalKeywords().size();
        for (int i = 0; i < size/2; i++){
            if (csvToEntity.getRegionalKeywords().get(i).getKeyword() != null) {
                builder1.addKeyword(csvToEntity.getRegionalKeywords().get(i).getKeyword());
            }
        }

        for (int i = size/2; i < size; i++){
            if (csvToEntity.getRegionalKeywords().get(i).getKeyword() != null) {
                builder2.addKeyword(csvToEntity.getRegionalKeywords().get(i).getKeyword());
            }
        }

        PayloadTrie<String> trie1 = builder1.build();
        PayloadTrie<String> trie2 = builder2.build();

        long start = System.currentTimeMillis();

        Callable<Collection<PayloadEmit<String>>> callable = () -> trie1.parseText("MCALISTERS DELI DELI DELI DELI");
        Callable<Collection<PayloadEmit<String>>> callable2 = () -> trie2.parseText("MCALISTERS DELI DELI DELI DELI");

        Future<Collection<PayloadEmit<String>>> future = service.submit(callable);
        Future<Collection<PayloadEmit<String>>> future2 = service.submit(callable2);

        Collection<PayloadEmit<String>> emits1 = new ArrayList<>();
        Collection<PayloadEmit<String>> emits2 = new ArrayList<>();

        try{
            emits1 = future.get();
            emits2 = future2.get();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(System.currentTimeMillis() - start);

        service.shutdown();

        System.out.println(emits1);
        System.out.println(emits2);

    }

    public void serialApproach(){
        List<RegionalKeyword> regionalKeywords = new ArrayList<>();
        CsvToEntity csvToEntity = new CsvToEntity(regionalKeywords);

        csvToEntity.fillRegionalKeywords("C:\\Users\\omar.mahamid\\Documents\\GitHub\\aho-corasick\\src\\main\\resources\\RegionalKeyword.csv");

        PayloadTrie.PayloadTrieBuilder<String> builder;

        builder = PayloadTrie.<String>builder().ignoreCase();

        csvToEntity.getRegionalKeywords().stream().filter(x -> x.getKeyword() != null).forEach(rk -> builder.addKeyword(rk.getKeyword()));

        PayloadTrie<String> trie = builder.build();

        long start = System.currentTimeMillis();

        Collection<PayloadEmit<String>> emits1 = trie.parseText("MCALISTERS DELI DELI DELI DELI");

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        System.out.println(emits1);

    }
}
