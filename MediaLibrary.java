package mediaLibrary;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <h1>MediaLibrary</h1>
 *
 * @author Leanne
 * @version 2
 * @since 02/10/2021
 */

public class MediaLibrary
{
    ArrayList<Media> mediaArray = new ArrayList<Media>();





    public MediaLibrary()
    {
    }


    /**
     * <h1> addMedia</h1>
     * <p> adds given parameters to the media array</p>
     * <br>
     * <p>adds addition to mediaArray
     * <br>calls for the mediaSorter()</p>
     * @param addition
     */
    public void addMedia(Media addition) {
        mediaArray.add(addition);

        mediaSorter();

    }

    /**
     * <h1> mediaSorter</h1>
     * <p> calls a comparator to sort the ArrayList by name</p>
     */
    public void mediaSorter()
    {
            Collections.sort(mediaArray, new NameSorter());
    }

    /**
     * <h1>printMedia</h1>
     * <p> displays each value name stored in the array</p>
     * <br>
     * <p> for loop, that loops the size of the array
     * </p>
     *
     */
    public void printMedia()
    {
        for(int i = 0; i<mediaArray.size(); i++)
        {
            System.out.print(" "+(i+1) + " "+ mediaArray.get(i).get_mName());
        }
        System.out.print("\n");

    }

    public Media findMedia(String findParameter)
    {
        for(int i = 0; i < mediaArray.size(); i++) {

            if (mediaArray.get(i).get_mName().equals(findParameter))
            {
                return mediaArray.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        MediaLibrary MyLibrary = new MediaLibrary();


        MediaLibraryTest_w3.acceptanceTest(MyLibrary);


    }









}
