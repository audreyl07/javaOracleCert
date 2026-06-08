package S9JavaOOP.Sealed;

//we are trying to permit only certain classes to inherit from this sealed class so that it controls and maintains some order
public sealed class Sealed permits Dog, Cat, Bird{
}
