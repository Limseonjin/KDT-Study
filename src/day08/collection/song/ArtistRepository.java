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
        return artistList.containsKey(artist);
    }
    // 신규 가수를 map에 추가하는 기능
    public void addNewArtist(String artistName, String songName) {

        // 1. 신규가수 정보를 생성
        Artist artist = new Artist(artistName, new HashSet<>());
        // 2. 생성된 노래 목록에 전달받은 노래를 추가
        artist.getSongList().add(songName);

        // 3. 가수 정보를 Map에 저장
        artistList.put(artistName, artist);
    }

    /*

    기존 가수 정보에 노래만 추가하는 기능
    @param singer - 사용자 입력 가수이름
    @param song - 사용자 입력 노래이름
    @return - 곡명이 중복되면 false / 곡이 정상적으로 추가
    * */
    public boolean addNewSong(String singer, String song){
        Artist artist = findArtistByName(singer);
        boolean flag = artist.getSongList().add(song);
        return flag;
    }

    private static Artist findArtistByName(String singer) {
        return artistList.get(singer);
    }


    public void serchArtist(String singer) {
        ArrayList<String> songList = new ArrayList<>(artistList.get(singer).getSongList());
        for (int i = 0; i < songList.size(); i++) {
            System.out.printf("* %d. %s\n",i+1,songList.get(i));
        }
    }
}
