package day08.collection.song;

import java.util.*;

public class ArtistRepository {

    //key: 가수이름 , value: 가수객체
    private static Map<String,Artist> artistList;
    static {
        artistList = new HashMap<>();
    }

    public int sizeArtistList(){
        return artistList.size();
    }

    public boolean isArtist(String artist){
        List<String> aList = new ArrayList<>(artistList.keySet());

        return aList.contains(artist);
    }

    public void newArtist(String singer, String song){
        Set<String> newSong = new HashSet<>();
        if (!isArtist(singer)){
            newSong.add(song);
            Artist newA = new Artist(singer,newSong);
            artistList.put(singer,newA);
            System.out.printf("# %s님이 신규 등록되었습니다.\n",singer);

        }else {
           newSong = (artistList.get(singer).getSongList());
           if(newSong.add(song)){
               artistList.get(singer).setSongList(newSong);
               System.out.println(singer+"님의 노래목록에 "+song+"곡이 추가되었습니다.");
           }
           else {
               System.out.printf("[%s]곡은 이미 등록된 노래입니다.",song);
           }

        }
    }

    public void serchArtist(String singer) {
        ArrayList<String> songList = new ArrayList<>(artistList.get(singer).getSongList());
        for (int i = 0; i < songList.size(); i++) {
            System.out.printf("* %d. %s\n",i+1,songList.get(i));
        }
    }
}
