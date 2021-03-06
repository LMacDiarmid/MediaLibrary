package mediaLibrary;

public class Media
{
    private String mName;
    private String mDescription;

    /**
     * <h1> Media constructor</h1>
     * takes in two parameters and sets the two member variables with its parameters
     *
     * @param name - name
     * @param description -description
     */
    public Media(String name, String description)
    {
        set_mName(name);
        set_mDescription(description);


    }

    /**
     * <h1> mName Setter</h1>
     * @param name - sets mName with parameter name
     */
    public void set_mName(String name)
    {

        this.mName = name;
    }

    /**
     * <h1>mDescription Setter</h1>
     * @param description - sets mDescription with parameter
     */
    public void set_mDescription(String description)
    {
        this.mDescription = description;
    }


    /**
     * <h1>mName Getter</h1>
     * @return mName is returned
     */
    public String get_mName()
    {
        return mName;
    }

    /**
     * <h1> mDescription Getter</h1>
     * @return mDescription is returned
     */
    public String get_mDescription()
    {
        return mDescription;
    }
}


