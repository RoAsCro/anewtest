public class BitTorrentDownloader {
private String host;
private int port;
public BitTorrentDownloader(String host, int port) {
this.host = host;
this.port = port;
}
public static void main(String[] args) {
// 1. Parameter analysis / processing
String host = args[0];
int port = Integer.parseInt(args[1]);
// 2. Object construction / building of main data structures
BitTorrentDownloader downloader = new BitTorrentDownloader(host, port);
// 3. Execution of the program
downloader.launch();
}
private void launch() {
// with the fields initialised,
// launching code comes here...
// ...
}
}