import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    // creating playlist
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    
    // adding songs to playlist
    desertIslandPlaylist.add("Zero 7 - In the Waiting Line");
    desertIslandPlaylist.add("Mazzy Star - Into Dust");
    desertIslandPlaylist.add("Moby - Porcelain");
    desertIslandPlaylist.add("R.E.M - All The Way to Reno");
    desertIslandPlaylist.add("Nirvana - Come As You Are");
    desertIslandPlaylist.add("Radiohead - Karma Police");
    desertIslandPlaylist.add("Erykah Badu - Window Seat");
    desertIslandPlaylist.add("The Pixies - Hey");
    desertIslandPlaylist.add("Al Green - Tired of Being Alone");
    desertIslandPlaylist.add("Lynard Skynard - Free Bird");
    
     // printing playlist
    // System.out.println(desertIslandPlaylist);
    
    // checking playlist size
    // System.out.println(desertIslandPlaylist.size());
    
    // removing songs
    desertIslandPlaylist.remove("Zero 7 - In the Waiting Line");
    desertIslandPlaylist.remove("Mazzy Star - Into Dust");
    desertIslandPlaylist.remove("Moby - Porcelain");
    desertIslandPlaylist.remove("R.E.M - All The Way to Reno");
    desertIslandPlaylist.remove("Nirvana - Come As You Are");
    
    // System.out.println(desertIslandPlaylist);
    
    // swapping songs
    int indexA = desertIslandPlaylist.indexOf("Radiohead - Karma Police");
    int indexB = desertIslandPlaylist.indexOf("The Pixies - Hey");
    
    String tempA = "Radiohead - Karma Police" ;
    
    desertIslandPlaylist.set(indexA,"The Pixies - Hey" );
    // System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
    
  }
  
}