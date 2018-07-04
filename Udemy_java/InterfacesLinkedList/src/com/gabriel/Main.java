package com.gabriel;

import java.util.*;

public class Main {
    // note Vector is a type of list and there are many other types of lists.
    // ArrayList
    // LinkedList
    // these are all interfaces and we can see this as we can change the LinkedList to a List and it still works fine.
    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        List<Song> playList = new ArrayList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        play(playList);

    }

    private static void play(List<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean directionForward = true;
        ListIterator<Song> songListIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + songListIterator.next().toString());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Playlist Complete");
                    quit = true;
                    break;
                case 1:
                    if (!directionForward) {
                        if (songListIterator.hasNext()) {
                            songListIterator.next();
                        }
                        directionForward = true;
                    }
                    if (songListIterator.hasNext()) {
                        System.out.println("Now Playing " + songListIterator.next());
                    } else {
                        System.out.println("Reached the end of the Playlist");
                        directionForward = false;
                    }
                    break;
                case 2:
                    if (directionForward) {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous();
                        }
                        directionForward = false;
                    }
                    if (songListIterator.hasPrevious()) {
                        System.out.println("Now playing " + songListIterator.previous());
                    } else {
                        System.out.println("We are at the start of the Playlist");
                        directionForward = true;
                    }
                    break;
                case 3:
                    if (directionForward) {
                        if (songListIterator.hasPrevious()) {
                            System.out.println("Now playing " + songListIterator.previous().toString());
                            directionForward = false;
                        } else {
                            System.out.println("We are at the start of the List");
                        }
                    } else {
                        if (songListIterator.hasNext()) {
                            System.out.println("Now playing " + songListIterator.next().toString());
                            directionForward = true;
                        } else {
                            System.out.println("We are at the end of the List");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        songListIterator.remove();
                        if (songListIterator.hasNext()){
                            System.out.println("Now playing "+songListIterator.next().toString());
                        }else if (songListIterator.hasPrevious()){
                            System.out.println("Now playing "+songListIterator.previous().toString());
                        }
                    }
                    break;
            }
        }
    }

    private static void printList(List<Song> playlist) {
        Iterator<Song> songIterator = playlist.iterator();
        System.out.println("==============================");
        while (songIterator.hasNext()) {
            System.out.println(songIterator.next());
        }
        System.out.println("==============================");
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - to next song\n" +
                "2 - to previous song\n" +
                "3 - to replay song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print menu options\n" +
                "6 - delete current song from playlist");
    }


}
